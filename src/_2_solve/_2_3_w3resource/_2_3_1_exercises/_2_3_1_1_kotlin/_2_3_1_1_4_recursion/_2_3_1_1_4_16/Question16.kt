package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_16

/**
 * Write a Kotlin tail-recursive function to calculate the nth Fibonacci number.
 * */

fun main() {
    print("Enter Position of Fibonacci Number: ")
    val positionOfFibonacciNumber = readln().toInt()
    print("Fibonacci Number = ${getFibonacciNumberOfPosition(positionOfFibonacciNumber)}")
}

private tailrec fun getFibonacciNumberOfPosition(
    number: Int,
    previousNumber: Long = 0,
    currentNumber: Long = 1
): Long = if (number == 0)
    previousNumber
else

    getFibonacciNumberOfPosition(
        number - 1,
        currentNumber,
        previousNumber + currentNumber
    )