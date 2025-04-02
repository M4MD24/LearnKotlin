package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_1_basic._2_3_1_1_1_3

import java.text.SimpleDateFormat
import java.util.Date

/**
 * Write a Kotlin program to display the current date and time.
 * */

fun main() {
    val currentDateAndTime = Date()
    val dateAndTimeFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val formattedDateAndTime = dateAndTimeFormat.format(currentDateAndTime)
    print("Current Date and Time: $formattedDateAndTime")
}