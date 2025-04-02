package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_9

import kotlin.math.PI

/**
 * Write a Kotlin function that calculates the area of a circle.
 * */

fun main() {
    print("Enter Radius: ")
    val radius = readln().toDouble()
    print("Area of Circle: ${areaOfCircle(radius)}")
}

private fun areaOfCircle(radius: Double) = PI * radius * radius