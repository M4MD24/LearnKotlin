package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_68_radius_of_circle

fun main() = print(getRadiusOfCircle(readln().toDouble()))

private const val PI = 3.14
private fun getRadiusOfCircle(circumference: Double) = circumference / (2 * PI)