package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_4

/**
 * Write a Kotlin recursive function to find the smallest element in an array.
 * */

fun main() {
    val numbers = listOf(0, 3, 4, 5, 1, -1)
    print("Minimum Number: ${findMinimumNumber(numbers)}")
}

private fun findMinimumNumber(
    numbers: List<Int>,
    index: Int = numbers.size - 1
): Int = if (index == 0)
    numbers[index]
else
    minOf(
        numbers[index],
        findMinimumNumber(
            numbers,
            index - 1
        )
    )