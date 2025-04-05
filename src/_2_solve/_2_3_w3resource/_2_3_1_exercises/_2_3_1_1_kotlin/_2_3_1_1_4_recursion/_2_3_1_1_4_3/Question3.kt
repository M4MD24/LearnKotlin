package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_3

/**
 * Write a Kotlin recursive function to calculate the sum of elements in an array.
 * */

fun main() {
    val numbers = listOf(1, 3, 4, 5)
    print("Sum of Numbers: ${getSumOfNumbers(numbers)}")
}

private fun getSumOfNumbers(
    numbers: List<Int>,
    index: Int = numbers.size - 1
): Long = if (index == 0)
    numbers[index].toLong()
else
    numbers[index] + getSumOfNumbers(numbers, index - 1)