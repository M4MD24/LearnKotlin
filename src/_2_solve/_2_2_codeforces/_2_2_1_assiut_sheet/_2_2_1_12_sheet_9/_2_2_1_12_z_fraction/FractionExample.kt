package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_z_fraction

fun main() {
    val (
        firstNumerator,
        firstDenominator,
        secondNumerator,
        secondDenominator
    ) = readln()
        .split(
            '/',
            ' '
        ).map { it.toInt() }
    print("${getLeastCommonMultiple(firstNumerator, secondNumerator)}/${getGreatestCommonDivisor(firstDenominator, secondDenominator)}")
}

private fun getGreatestCommonDivisor(firstNumber: Int, secondNumber: Int): Int = if (secondNumber == 0)
    firstNumber
else
    getGreatestCommonDivisor(
        secondNumber,
        firstNumber % secondNumber
    )

private fun getLeastCommonMultiple(firstNumber: Int, secondNumber: Int) = firstNumber / getGreatestCommonDivisor(firstNumber, secondNumber) * secondNumber