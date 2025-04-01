package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_1_basic._2_3_1_1_1_7

/**
 * Write a Kotlin program to find the maximum and minimum of three numbers.
 * */

fun main() {
    print("Enter First Number: ")
    val firstNumber = readln().toInt()
    print("Enter Second Number: ")
    val secondNumber = readln().toInt()
    print("Enter Third Number: ")
    val thirdNumber = readln().toInt()
    print(
        """
        Maximum of Three Numbers: ${maxOf(firstNumber, secondNumber, thirdNumber)}
        Minimum of Three Numbers: ${minOf(firstNumber, secondNumber, thirdNumber)}""".trimIndent()
    )
}