package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_14

import _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_14.shapes.Circle
import _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_14.shapes.Rectangle

/**
 * Write a Kotlin program that creates a class 'Shape' with an abstract function to calculate the area. Create subclasses 'Circle' and 'Rectangle' that override the area calculation function.
 * */

fun main() {
    circleCase()
    println('\n')
    rectangleCase()
}

private fun circleCase() {
    println("# Circle Case")
    print("Enter Radius: ")
    val radius = readln().toDouble()
    val circle = Circle(radius)
    print("Area of Circle = ${circle.area()}")
}

private fun rectangleCase() {
    println("# Rectangle Case")
    print("Enter Width: ")
    val width = readln().toDouble()
    print("Enter Length: ")
    val length = readln().toDouble()
    val rectangle = Rectangle(width, length)
    print("Area of Rectangle = ${rectangle.area()}")
}