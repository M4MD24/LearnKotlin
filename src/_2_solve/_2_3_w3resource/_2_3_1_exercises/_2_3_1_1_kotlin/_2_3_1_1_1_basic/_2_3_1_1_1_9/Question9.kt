package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_1_basic._2_3_1_1_1_9

import java.time.Year

/**
 * Write a Kotlin program to check if a given year is a leap year.
 * */

fun main() {
    print("Enter Year Number: ")
    val yearNumber = readln().toLong()
    print(
        "$yearNumber is ${
            if (Year.isLeap(yearNumber))
                ""
            else
                "Not "
        }Leap"
    )
}