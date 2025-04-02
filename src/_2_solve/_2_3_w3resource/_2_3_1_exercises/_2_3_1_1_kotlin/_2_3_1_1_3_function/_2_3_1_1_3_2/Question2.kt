package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_2

/**
 * Write a Kotlin function that takes an array of integers and prints only even numbers.
 * */

fun main() {
    val numbers = listOf(1, 65, 4, 6, 78, 6, 2, 5, 3, 64, 98, 54, 321, 3, 8, 7, 2, 56, 132, 0, 60)
    printEvenNumbers(numbers)
}

private fun printEvenNumbers(numbers: List<Int>) = print(numbers.filter { it % 2 == 0 })