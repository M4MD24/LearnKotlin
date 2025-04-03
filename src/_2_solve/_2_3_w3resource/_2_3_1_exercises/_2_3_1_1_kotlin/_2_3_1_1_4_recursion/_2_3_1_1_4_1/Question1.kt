package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_1

/**
 * Write a Kotlin recursive function to calculate the sum of the digits of a positive integer.
 * */

fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    require(number > 0) { "Number must be positive integer!" }
    print("Sum of Digits Of Numbers: ${getSumOfDigits(number)}")
}

private fun getSumOfDigits(number: Int): Int = if (number < 10)
    number
else
    number % 10 + getSumOfDigits(number / 10)