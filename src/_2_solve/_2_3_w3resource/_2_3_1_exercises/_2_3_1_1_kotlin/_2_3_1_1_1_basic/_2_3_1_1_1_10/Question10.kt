package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_1_basic._2_3_1_1_1_10

import kotlin.math.PI
import kotlin.math.pow

/**
 * Write a Kotlin program to calculate the area and perimeter of a circle.
 * */

fun main() {
    print("Enter Radius: ")
    val radius = readln().toDouble()
    print(
        """
        Area of Circle: ${getAreaOfCircle(radius)}
        Perimeter Of Circle: ${getPerimeterOfCircle(radius)}""".trimIndent()
    )
}

private fun getPerimeterOfCircle(radius: Double) = 2 * PI * radius

private fun getAreaOfCircle(radius: Double) = PI * radius.pow(2)