package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_8_sheet_5._2_2_1_8_g_minimum_and_maximum

fun main() {
    val countOfNumbers = readln().toShort()
    val numbers = readln()
        .split(' ')
        .map { it.toInt() }
    val minimumNumber = numbers.minOf { it }
    val maximumNumber = numbers.maxOf { it }
    print("$minimumNumber $maximumNumber")
}