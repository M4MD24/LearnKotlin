package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_z_hard_compare

import kotlin.math.ln

fun main() {
    val line = readln().split(' ')
    val firstNumber = line[0].toInt()
    val secondNumber = line[1].toLong()
    val thirdNumber = line[2].toInt()
    val fourthNumber = line[3].toLong()
    val resultOfFirstNumberAndSecondNumber = getLogarithmMultipliedValue(firstNumber, secondNumber)
    val resultOfThirdNumberAndFourthNumber = getLogarithmMultipliedValue(thirdNumber, fourthNumber)
    print(
        if (resultOfFirstNumberAndSecondNumber > resultOfThirdNumberAndFourthNumber)
            "YES"
        else
            "NO"
    )
}

private fun getLogarithmMultipliedValue(baseNumber: Int, multiplier: Long) = ln(baseNumber.toDouble()) * multiplier