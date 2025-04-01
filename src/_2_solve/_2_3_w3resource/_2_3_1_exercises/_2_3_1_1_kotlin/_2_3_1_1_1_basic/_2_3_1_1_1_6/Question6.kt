package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_1_basic._2_3_1_1_1_6

/**
 * Write a Kotlin program to check if a given number is even or odd.
 * */

fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    print(
        "$number is ${
            if (number % 2 == 0)
                "Even"
            else
                "Odd"
        }"
    )
}