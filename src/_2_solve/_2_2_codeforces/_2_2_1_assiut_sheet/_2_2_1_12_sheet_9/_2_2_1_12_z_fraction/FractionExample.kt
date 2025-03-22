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
        ).map { it.toLong() }

    val commonDenominator = leastCommonMultiple(
        firstDenominator,
        secondDenominator
    )
    val commonNumerator = greatestCommonDivisor(
        firstNumerator * (commonDenominator / firstDenominator),
        secondNumerator * (commonDenominator / secondDenominator)
    )

    print("$commonNumerator/$commonDenominator")
}

fun greatestCommonDivisor(
    firstNumber: Long,
    secondNumber: Long
): Long = if (secondNumber == 0L)
    firstNumber
else
    greatestCommonDivisor(
        secondNumber,
        firstNumber % secondNumber
    )

fun leastCommonMultiple(
    firstNumber: Long,
    secondNumber: Long
) = firstNumber / greatestCommonDivisor(
    firstNumber,
    secondNumber
) * secondNumber