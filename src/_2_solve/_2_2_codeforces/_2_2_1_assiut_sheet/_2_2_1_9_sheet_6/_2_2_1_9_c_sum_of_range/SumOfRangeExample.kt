package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_c_sum_of_range

fun main() {
    var (
        firstNumber,
        secondNumber
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    if (firstNumber > secondNumber)
        firstNumber = secondNumber.also { secondNumber = firstNumber }
    print(
        """
        ${getSummationOfAllFromMinimumNumberToMaximumNumberInclusive(firstNumber, secondNumber)}
        ${getSummationOfEvenFromMinimumNumberToMaximumNumberInclusive(firstNumber, secondNumber)}
        ${getSummationOfOddFromMinimumNumberToMaximumNumberInclusive(firstNumber, secondNumber)}""".trimIndent()
    )
}

private fun getSummationOfAllFromMinimumNumberToMaximumNumberInclusive(
    minimumNumber: Int,
    maximumNumber: Int
) = ((maximumNumber - minimumNumber) + 1).toLong() * (minimumNumber + maximumNumber) / 2

private fun getSummationOfEvenFromMinimumNumberToMaximumNumberInclusive(
    minimumNumber: Int,
    maximumNumber: Int
) = getSummationOfEvenFromOneToTargetNumber(maximumNumber / 2) -
        getSummationOfEvenFromOneToTargetNumber((minimumNumber - 1) / 2)

private fun getSummationOfEvenFromOneToTargetNumber(targetNumber: Int) = targetNumber * (targetNumber + 1L)

private fun getSummationOfOddFromMinimumNumberToMaximumNumberInclusive(
    minimumNumber: Int,
    maximumNumber: Int
) = getSummationOfOddFromOneToTargetNumber(maximumNumber) -
        getSummationOfOddFromOneToTargetNumber(minimumNumber - 1)

private fun getSummationOfOddFromOneToTargetNumber(targetNumber: Int) = ((targetNumber + 1) / 2).toLong() * ((targetNumber + 1) / 2)