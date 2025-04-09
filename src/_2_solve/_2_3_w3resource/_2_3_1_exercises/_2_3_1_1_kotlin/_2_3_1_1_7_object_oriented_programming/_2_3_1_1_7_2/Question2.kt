package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_2

/**
 * Write a Kotlin object-oriented program that implements a singleton pattern for a class Logger to provide logging functionality throughout the application
 * */

fun main() {
    val firstLog = Logger
    firstLog.log("First Message")
    val secondLog = Logger
    secondLog.log("Second Message")
    print("Is (${firstLog.getLastMessage()}) == (${secondLog.getLastMessage()}) ?\n${firstLog == secondLog}")
}