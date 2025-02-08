package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_58_area_of_rhombus

fun main() = print(areaOfRhombus(readln().toDouble(), readln().toDouble()))

private fun areaOfRhombus(firstDiagonal: Double, secondDiagonal: Double) = firstDiagonal * secondDiagonal / 2