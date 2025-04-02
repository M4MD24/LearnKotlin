package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_8

/**
 * Write a Kotlin function that calculates the Body Mass Index (BMI) of a person. The function should take the height (in meters) and weight (in kilograms) as arguments. Use default arguments for height and weight.
 * */

fun main() {
    println("Enter Length (in Meters) ")
    val length = readln().toDouble()
    println("Enter Width: (in Kilograms)")
    val width = readln().toDouble()
    print("Area of Rectangle: ${getBMI(length, width)}")
}

/**
 * `BMI` = Body Mass Index
 */
private fun getBMI(
    height: Double = 0.0,
    weight: Double = 0.0
): Double {
    require(height > 0.0) { "Height must be greater than 0." }
    require(weight > 0.0) { "Weight must be greater than 0." }
    return weight / (height * height)
}