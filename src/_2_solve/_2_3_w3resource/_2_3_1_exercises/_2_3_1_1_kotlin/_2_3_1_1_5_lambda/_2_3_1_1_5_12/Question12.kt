package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_5_lambda._2_3_1_1_5_12

/**
 * Write an anonymous Kotlin function to calculate the sum of all odd numbers in a list.
 * */

fun main() {
    val numbers = listOf(1, 5, 4, 2, 3)
    val sumOfOddNumbers = { values: List<Int> -> values.filter { it % 2 != 0 }.sum() }
    print("Sum of Odd Numbers: ${sumOfOddNumbers(numbers)}")
}