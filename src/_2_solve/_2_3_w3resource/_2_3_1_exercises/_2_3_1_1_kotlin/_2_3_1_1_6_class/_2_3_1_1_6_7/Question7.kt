package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_7

/**
 * Write a Kotlin program that creates a class 'Circle' with properties for radius and center coordinates. Include a function to calculate the circle circumference.
 * */

fun main() {
    print("Enter Radius: ")
    val radius = readln().toDouble()
    print("Enter Center X: ")
    val centerX = readln().toDouble()
    print("Enter Center Y: ")
    val centerY = readln().toDouble()
    val circle = Circle(radius, centerX, centerY)
    print("Circumference of Circle = ${circle.circumference()}")
}