package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_16

/**
 * Write a Kotlin program that creates a class 'Logger' with a companion object that provides logging functionality.
 * */

fun main() {
    print("Enter Message: ")
    val message = readln()
    Logger.log(message)
}