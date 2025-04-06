package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_5_lambda._2_3_1_1_5_14

/**
 * Write an anonymous Kotlin function to find the average of the squares of a list of numbers.
 * */

fun main() {
    val numbers = listOf(1, 5, 4, 2, 3)
    val averageOfSquares = { values: List<Int> ->
        values
            .map { it * it }
            .average()
    }
    print("Average of Squares: ${averageOfSquares(numbers)}")
}