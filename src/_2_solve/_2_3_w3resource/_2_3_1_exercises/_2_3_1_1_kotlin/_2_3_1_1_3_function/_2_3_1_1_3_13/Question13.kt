package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_13

/**
 * Write a Kotlin function that takes a list of integers as an argument and prints only the even numbers in the list. The function should return Unit.
 * */

fun main() {
    val numbers = listOf(1, 65, 4, 6, 78, 6, 2, 5, 3, 64, 98, 54, 321, 3, 8, 7, 2, 56, 132, 0, 60)
    printEvenNumbers(numbers)
}

private fun printEvenNumbers(numbers: List<Int>) = print(numbers.filter { it % 2 == 0 })