package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_1

import _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_1.shapes.Circle
import _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_1.shapes.Rectangle
import _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_1.shapes.Triangle

/**
 * Write a Kotlin object-oriented program that creates a base class Shape and derives subclasses Circle, Rectangle, and Triangle. Implement appropriate methods in each class and demonstrate polymorphism.
 * */

fun main() {
    circleCase()
    println('\n')
    rectangleCase()
    println('\n')
    triangleCase()
}

private fun triangleCase() {
    println("# Triangle Case")
    print("Enter First Side: ")
    val firstSide = readln().toDouble()
    print("Enter Second Side: ")
    val secondSide = readln().toDouble()
    print("Enter Third Side: ")
    val thirdSide = readln().toDouble()
    val triangle = Triangle(
        firstSide,
        secondSide,
        thirdSide
    )
    triangle.printAreaAndPerimeter()
}

private fun rectangleCase() {
    println("# Rectangle Case")
    print("Enter Width: ")
    val width = readln().toDouble()
    print("Enter Length: ")
    val length = readln().toDouble()
    val rectangle = Rectangle(
        width,
        length
    )
    rectangle.printAreaAndPerimeter()
}

private fun circleCase() {
    println("# Circle Case")
    print("Enter Radius: ")
    val radius = readln().toDouble()
    val circle = Circle(radius)
    circle.printAreaAndPerimeter()
}