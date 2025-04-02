package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_2_control_flow._2_3_1_1_2_4

/**
 * Write a Kotlin program to print the first 10 natural numbers.
 * */

fun main() {
    print("Enter Target Number: ")
    val targetNumber = readln().toInt()
    print((1..targetNumber).joinToString(" ") { "$it" })
}