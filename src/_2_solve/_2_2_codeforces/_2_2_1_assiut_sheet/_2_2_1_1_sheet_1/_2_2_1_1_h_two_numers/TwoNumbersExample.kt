package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_h_two_numers

import kotlin.math.ceil
import kotlin.math.floor

fun main() {
    val line = readln().split(' ')
    val firstNumber = line[0].toLong()
    val secondNumber = line[1].toLong()
    val resultOfDivideTwoNumbers = firstNumber.toFloat() / secondNumber
    print(
        """
        floor $firstNumber / $secondNumber = ${floor(resultOfDivideTwoNumbers).toLong()}
        ceil $firstNumber / $secondNumber = ${ceil(resultOfDivideTwoNumbers).toLong()}
        round $firstNumber / $secondNumber = ${Math.round(resultOfDivideTwoNumbers)}""".trimIndent()
    )
}