package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_2_contest_1._2_2_1_2_e_interval_sweep

import kotlin.math.abs

fun main() {
    val line = readln().split(' ')
    val firstNumber = line[0].toByte()
    val secondNumber = line[1].toByte()
    print(isEmpty(firstNumber, secondNumber))
}

private fun isEmpty(firstNumber: Byte, secondNumber: Byte) = if (
    firstNumber + secondNumber >= 3 &&
    abs(firstNumber - secondNumber).toDouble() <= 1
) "YES"
else "NO"