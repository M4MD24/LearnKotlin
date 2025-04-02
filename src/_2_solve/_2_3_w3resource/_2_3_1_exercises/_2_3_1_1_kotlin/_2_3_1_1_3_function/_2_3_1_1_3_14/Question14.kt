package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_14

/**
 * Write a Kotlin single-expression function that takes a number as an argument and returns true if it is negative, false otherwise.
 * */

fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    print("$number is negative?\n${isNegative(number)}")
}

private fun isNegative(number: Int): Boolean = number < 0