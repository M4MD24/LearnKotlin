package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_5_lambda._2_3_1_1_5_3

/**
 * Write a Kotlin program that implements a lambda expression to check if a number is even.
 * */

fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    val isNumberEven: (Int) -> Boolean = { value -> value % 2 == 0 }
    print("$number is even?\n${isNumberEven(number)}")
}