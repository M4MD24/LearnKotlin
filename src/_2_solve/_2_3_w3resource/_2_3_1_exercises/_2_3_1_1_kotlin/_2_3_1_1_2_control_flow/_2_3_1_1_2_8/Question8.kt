package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_2_control_flow._2_3_1_1_2_8

/**
 * Write a Kotlin program to generate the multiplication table of a given number.
 * */

fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    print((1..12).joinToString("\n") { "$number * $it = ${number * it}" })
}