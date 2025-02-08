package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_70_area_of_circle

fun main() = print(getAreaOfCircle(readln().toDouble()))

private const val PI = 3.14
private fun getAreaOfCircle(radius: Double) = PI * radius * radius