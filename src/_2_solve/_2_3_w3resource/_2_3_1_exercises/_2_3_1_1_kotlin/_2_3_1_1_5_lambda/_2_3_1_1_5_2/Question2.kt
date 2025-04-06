package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_5_lambda._2_3_1_1_5_2

/**
 * Write a Kotlin program that implements a lambda expression to find the square of a number and return the result.
 * */

fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    val squareOfNumber: (Int) -> Int = { value -> value * value }
    print("$number^2 = ${squareOfNumber(number)}")
}