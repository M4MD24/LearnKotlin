package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_5_lambda._2_3_1_1_5_6

/**
 * Write a Kotlin program that implements a lambda expression to sort a list of integers in descending order.
 * */

fun main() {
    val numbers = listOf(1, 35, 2, 6, 4, 32, 1, 3, 4, 13, 2)
    val sortedNumbersByDescendingOrder: (List<Int>) -> List<Int> = { values -> values.sortedDescending() }
    print("Sorted Numbers by Descending Order: ${sortedNumbersByDescendingOrder(numbers)}")
}