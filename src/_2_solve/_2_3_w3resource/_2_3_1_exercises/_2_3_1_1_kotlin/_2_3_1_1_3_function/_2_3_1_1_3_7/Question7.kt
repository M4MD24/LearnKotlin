package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_7

/**
 * Write a Kotlin function that calculates and returns the area of a rectangle. It should take 'length' and 'width' as arguments, with default values of 0.0.
 * */

fun main() {
    print("Enter Length: ")
    val length = readln().toDouble()
    print("Enter Width: ")
    val width = readln().toDouble()
    print("Area of Rectangle: ${areaOfRectangle(length, width)}")
}

private fun areaOfRectangle(
    length: Double = 0.0,
    width: Double = 0.0
) = length * width