package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_12

/**
 * Write a Kotlin function that takes an integer n as an argument and prints the numbers from 1 to n on separate lines. The function should return Unit.
 * */

fun main() {
    print("Enter Target Number: ")
    val targetNumber = readln().toInt()
    printNumbersFrom1ToTargetNumber(targetNumber)
}

private fun printNumbersFrom1ToTargetNumber(targetNumber: Int) = print((0..targetNumber).joinToString(", "))