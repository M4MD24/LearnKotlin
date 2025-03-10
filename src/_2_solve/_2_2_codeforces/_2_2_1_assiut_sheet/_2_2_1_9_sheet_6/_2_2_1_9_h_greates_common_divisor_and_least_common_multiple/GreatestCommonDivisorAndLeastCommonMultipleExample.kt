package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_h_greates_common_divisor_and_least_common_multiple

fun main() {
    val (
        firstNumber,
        secondNumber
    ) = readln()
        .split(' ')
        .map { it.toLong() }
    val greatestCommonDivisor = getGreatestCommonDivisor(
        firstNumber,
        secondNumber
    )
    val leastCommonMultiple = getLeastCommonMultiple(
        firstNumber,
        secondNumber,
        greatestCommonDivisor
    )
    print("$greatestCommonDivisor $leastCommonMultiple")
}

private tailrec fun getGreatestCommonDivisor(
    firstNumber: Long,
    secondNumber: Long
): Long = if (secondNumber == (0).toLong())
    firstNumber
else
    getGreatestCommonDivisor(
        secondNumber,
        firstNumber % secondNumber
    )

private fun getLeastCommonMultiple(
    firstNumber: Long,
    secondNumber: Long,
    greatestCommonDivisor: Long
) = firstNumber * secondNumber / greatestCommonDivisor

// >
/*
private fun getLeastCommonMultiple(
    firstNumber: Long,
    secondNumber: Long,
    greatestCommonDivisor: Long
) = firstNumber / greatestCommonDivisor * secondNumber
*/