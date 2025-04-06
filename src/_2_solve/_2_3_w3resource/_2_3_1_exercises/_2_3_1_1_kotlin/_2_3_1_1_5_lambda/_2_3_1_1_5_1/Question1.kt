package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_5_lambda._2_3_1_1_5_1

/**
 * Write a Kotlin program that implements a lambda expression to multiply two numbers and return the result.
 * */

fun main() {
    print("Enter First Number: ")
    val firstNumber = readln().toInt()
    print("Enter Second Number: ")
    val secondNumber = readln().toInt()

    val resultOfMultiplicationOfTwoNumbers: (Int, Int) -> Int = { firstValue, secondValue -> firstValue * secondValue }
    print("$firstNumber * $secondNumber = ${resultOfMultiplicationOfTwoNumbers(firstNumber, secondNumber)}")
}