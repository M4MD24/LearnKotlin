package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_5_lambda._2_3_1_1_5_4

/**
 * Write a Kotlin program that implements a lambda expression to calculate the average of a list of numbers.
 * */

fun main() {
    print("Enter Number: ")
    val numbers = listOf(1, 2, 3, 4, 5)
    val averageNumbers: (List<Int>) -> Double = { values -> values.average() }
    print("Average Numbers = ${averageNumbers(numbers)}")
}