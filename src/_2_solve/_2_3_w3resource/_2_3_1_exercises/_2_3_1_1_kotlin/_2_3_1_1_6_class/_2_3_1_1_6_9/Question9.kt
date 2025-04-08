package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_9

/**
 * Write a Kotlin program that creates a class 'Triangle' with side length properties. Include a function to calculate the triangle perimeter.
 * */

fun main() {
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
    print("Perimeter of Triangle = ${triangle.perimeter()}")
}