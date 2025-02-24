package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_6_contest_3_1._2_2_1_6_g_even_hate_odd

import kotlin.math.abs

fun main() {
    val countOfCases = readln().toInt()
    repeat(countOfCases) {
        val countOfValues = readln().toInt()
        val values = readln()
            .split(' ')
            .map { it.toInt() }
        val countEven = values.count { it % 2 == 0 }
        val countOdd = countOfValues - countEven
        println(
            if (countOfValues % 2 == 1)
                -1
            else
                abs(countEven - countOdd) / 2
        )
    }
}