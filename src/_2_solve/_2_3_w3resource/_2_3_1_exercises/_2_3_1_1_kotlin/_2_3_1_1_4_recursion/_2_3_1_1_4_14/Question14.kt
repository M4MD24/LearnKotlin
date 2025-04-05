package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_14

/**
 * Write a Kotlin tail recursive function that calculates the factorial of a given number.
 * */

fun main() {
    print("Enter Number: ")
    val number = readln().toByte()
    print("Factorial of $number = ${getFactorial(number)}")
}

private tailrec fun getFactorial(
    targetNumber: Byte,
    accumulator: Long = 1
): Long = if (targetNumber <= 1)
    accumulator
else getFactorial(
    (targetNumber - 1).toByte(),
    targetNumber * accumulator
)