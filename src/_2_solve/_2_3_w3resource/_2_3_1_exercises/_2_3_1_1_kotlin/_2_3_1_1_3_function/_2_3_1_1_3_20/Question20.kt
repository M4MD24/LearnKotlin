package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_20

/**
 * Write a Kotlin function inside another function that calculates the square of a number.
 * */

fun main() {
    print("Enter number: ")
    val number = readln().toInt()
    printSquareOfNumber(number)
}

private fun printSquareOfNumber(number: Int) {
    fun calculateSquareOfNumber(number: Int) = number * number
    print("Square of $number = ${calculateSquareOfNumber(number)}")
}