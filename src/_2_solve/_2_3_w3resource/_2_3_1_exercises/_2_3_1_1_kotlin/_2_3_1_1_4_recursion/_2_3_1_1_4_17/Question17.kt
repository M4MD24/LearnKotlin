package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_17

/**
 * Write a Kotlin tail-recursive function to calculate the power of a number.
 * */

fun main() {
    print("Enter Base Number: ")
    val baseNumber = readln().toInt()
    print("Enter Exponent: ")
    val exponent = readln().toInt()
    print("$baseNumber^$exponent = ${power(baseNumber, exponent)}")
}

private tailrec fun power(
    base: Int,
    exponent: Int,
    powerOfNumber: Int = 1
): Int = if (exponent == 0)
    powerOfNumber
else
    power(
        base,
        exponent - 1,
        powerOfNumber * base
    )