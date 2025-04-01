package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_t_combination

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = inputAndPrintValues()

private fun inputAndPrintValues() {
    val input = StringBuilder(BufferedReader(InputStreamReader(System.`in`)).readLine())
    print(
        getCombination(
            input.substring(
                0,
                input.indexOf(" ")
            ).toByte(),
            input.substring(
                input.indexOf(" ") + 1,
                input.length
            ).toByte()
        )
    )
}

private fun getCombination(
    firstNumber: Byte,
    secondNumber: Byte
) = if (secondNumber > firstNumber)
    0
else
    combinationRecursion(firstNumber, secondNumber)

private fun combinationRecursion(number1: Byte, number2: Byte): Long {
    return if (number2.toInt() == 0 || number1 - 1 == number2 - 1)
        1
    else
        combinationRecursion((number1 - 1).toByte(), (number2 - 1).toByte()) * number1 / number2
}