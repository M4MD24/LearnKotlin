package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_49_perimeter_of_parallelogram

fun main() = print(perimeterOfParallelogram(readln().toDouble(), readln().toDouble()))

private fun perimeterOfParallelogram(baseLength: Double, sideLength: Double) = 2 * (baseLength + sideLength)