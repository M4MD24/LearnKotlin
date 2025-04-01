package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_2_control_flow._2_3_1_1_2_10

/**
 * Write a Kotlin program to find the GCD (Greatest Common Divisor) of two numbers.
 * */

fun main() {
    print("Enter first number: ")
    val firstNumber = readln().toInt()

    print("Enter second number: ")
    val secondNumber = readln().toInt()

    print("Greatest Common Divisor of Two Numbers: ${getGreatestCommonDivisor(firstNumber, secondNumber)}")
}

private fun getGreatestCommonDivisor(
    firstNumber: Int,
    secondNumber: Int
): Int = if (secondNumber == 0)
    firstNumber
else
    getGreatestCommonDivisor(
        secondNumber,
        firstNumber % secondNumber
    )