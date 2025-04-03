package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_6

/**
 * Write a Kotlin recursive function to calculate the product of all odd numbers in a range.
 * */

fun main() {
    val numbers = listOf(4, 2, 6, 3, 5)
    print("Product of All Odd Numbers: ${productOfOddNumbers(numbers)}")
}

private fun productOfOddNumbers(
    numbers: List<Int>,
    index: Int = numbers.size - 1
): Int = if (index == 0)
    1
else if (numbers[index] % 2 != 0)
    numbers[index] * productOfOddNumbers(
        numbers,
        index - 1
    )
else
    productOfOddNumbers(
        numbers,
        index - 1
    )