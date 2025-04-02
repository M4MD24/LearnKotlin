package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_16

/**
 * Write a Kotlin function that takes two numbers as arguments and returns their sum. Explicitly specify the return type.
 * */

fun main() {
    print("Enter First Number: ")
    val firstNumber = readln().toInt()

    print("Enter Second Number: ")
    val secondNumber = readln().toInt()

    print("Sum of Two Numbers: ${firstNumber getSumWith secondNumber}")
}

private infix fun Int.getSumWith(secondNumber: Int) = this + secondNumber