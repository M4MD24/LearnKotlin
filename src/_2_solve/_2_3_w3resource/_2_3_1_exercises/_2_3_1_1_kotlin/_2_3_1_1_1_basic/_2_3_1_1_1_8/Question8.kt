package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_1_basic._2_3_1_1_1_8

/**
 * Write a Kotlin program to find the factorial of a given number.
 * */

fun main() {
    print("Enter Number: ")
    val number = readln().toByte()
    print("Factorial of $number: ${getFactorial(number)}")
}

private fun getFactorial(
    currentNumber: Byte,
    accumulator: Long = 1
): Long = if (currentNumber <= 1)
    accumulator
else getFactorial(
    (currentNumber - 1).toByte(),
    currentNumber * accumulator
)