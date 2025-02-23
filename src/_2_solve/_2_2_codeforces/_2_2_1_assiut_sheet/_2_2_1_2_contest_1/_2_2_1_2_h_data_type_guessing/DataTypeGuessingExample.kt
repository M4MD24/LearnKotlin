package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_2_contest_1._2_2_1_2_h_data_type_guessing

import kotlin.math.max
import kotlin.math.min

fun main() {
    val (firstNumber, secondNumber, thirdNumber) = readln()
        .split(' ')
        .map { it.toDouble() }
    print(getDataType(firstNumber, secondNumber, thirdNumber))
}

private fun getDataType(
    firstNumber: Double,
    secondNumber: Double,
    thirdNumber: Double
): String {
    val resultOfThreeNumbers = firstNumber * secondNumber / thirdNumber
    val productOfMinimumAndMaximum = min(firstNumber, secondNumber) / thirdNumber * max(firstNumber, secondNumber)
    val decimalPart = productOfMinimumAndMaximum - productOfMinimumAndMaximum.toLong()
    return if (
        decimalPart > 0 &&
        decimalPart < 1
    ) "double"
    else if (resultOfThreeNumbers.toLong() > resultOfThreeNumbers.toInt())
        "long long"
    else
        "int"
}