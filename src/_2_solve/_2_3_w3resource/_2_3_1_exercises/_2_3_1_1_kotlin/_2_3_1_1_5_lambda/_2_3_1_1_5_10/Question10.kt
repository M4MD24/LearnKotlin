package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_5_lambda._2_3_1_1_5_10

/**
 * Write an anonymous Kotlin function to find the maximum element in an array.
 * */

fun main() {
    val numbers = listOf(1, 35, 2, 6, 4, 32, 1, 3, 4, 13, 2)
    val maximumNumber = { values: List<Int> -> values.maxOf { it } }
    print("Maximum Number = ${maximumNumber(numbers)}")
}