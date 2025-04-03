package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_10

/**
 * Write a Kotlin recursive function to calculate the sum of the even Fibonacci numbers up to a given limit.
 * */

fun main() {
    print("Enter Limit of Numbers: ")
    val limitNumber = readln().toInt()
    print("Sum of even Fibonacci: ${sumEvenFibonacci(limitNumber)}")
}

private fun sumEvenFibonacci(
    limitNumber: Int,
    currentNumber: Int = 1,
    nextNumber: Int = 2,
): Int =
    if (currentNumber > limitNumber)
        0
    else
        (
                if (currentNumber % 2 == 0)
                    currentNumber
                else
                    0
                ) +
                sumEvenFibonacci(
                    limitNumber,
                    nextNumber,
                    currentNumber + nextNumber
                )