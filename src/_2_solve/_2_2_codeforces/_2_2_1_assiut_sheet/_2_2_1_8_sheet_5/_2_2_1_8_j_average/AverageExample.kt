package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_8_sheet_5._2_2_1_8_j_average

fun main() {
    val countOfNumbers = readln().toInt()
    val numbers = readln()
        .split(' ')
        .map { it.toFloat() }
    printAverage(numbers)
}

private fun printAverage(numbers: List<Float>) = print("%.6f".format(numbers.average()))