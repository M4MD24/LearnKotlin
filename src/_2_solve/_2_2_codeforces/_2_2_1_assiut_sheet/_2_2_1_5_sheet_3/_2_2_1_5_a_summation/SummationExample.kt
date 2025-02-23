package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_a_summation

import kotlin.math.abs

fun main() {
    val countOfValues = readln()
    val numbers = readln()
        .split(' ')
        .map { it.toInt() }
    val sumOfNumbers: Long = numbers.sumOf { it.toLong() }
    print(abs(sumOfNumbers))
}