package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_18

/**
 * Write a Kotlin function that takes a variable number of arguments (varargs) and calculates the average of those numbers.
 * */

fun main() = print("Average Of Numbers: ${getAverageOfNumbers(1.0, 2.0, 6.0)}")

private fun getAverageOfNumbers(vararg numbers: Double) = numbers.average()