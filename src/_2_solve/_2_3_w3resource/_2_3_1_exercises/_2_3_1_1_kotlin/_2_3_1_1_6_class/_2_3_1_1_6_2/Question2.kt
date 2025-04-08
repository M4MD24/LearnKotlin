package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_2

/**
 * Write a Kotlin program that creates a class 'Rectangle' with properties for width and height. Include a function to calculate the rectangle area.
 * */

fun main() {
    print("Enter Height: ")
    val height = readln().toDouble()
    print("Enter Width: ")
    val width = readln().toDouble()
    val areaOfRectangle = Rectangle(width, height).area()
    print("Area of Rectangle: $areaOfRectangle")
}