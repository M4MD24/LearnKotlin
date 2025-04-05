package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_2

/**
 * Write a Kotlin recursive function to calculate the power of a number.
 * */

fun main() {
    print("Enter Base Number: ")
    val baseNumber = readln().toInt()
    print("Enter Exponent: ")
    val exponent = readln().toInt()
    print("$baseNumber^$exponent = ${getPowerOfNumber(baseNumber, exponent)}")
}

private fun getPowerOfNumber(
    baseNumber: Int,
    exponent: Int
): Long = if (exponent == 1)
    baseNumber.toLong()
else
    baseNumber * getPowerOfNumber(baseNumber, exponent - 1)