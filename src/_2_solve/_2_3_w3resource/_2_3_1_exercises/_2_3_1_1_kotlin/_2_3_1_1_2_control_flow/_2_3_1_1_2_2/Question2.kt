package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_2_control_flow._2_3_1_1_2_2

/**
 * Write a Kotlin program to check if a given number is divisible by 7.
 * */

fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    val divisibleNumber = 7
    print("Is $number Divisible by $divisibleNumber?\n${number % divisibleNumber == 0}")
}