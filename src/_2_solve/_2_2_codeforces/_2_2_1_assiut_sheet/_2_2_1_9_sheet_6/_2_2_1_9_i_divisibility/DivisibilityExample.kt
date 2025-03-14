package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_i_divisibility

fun main() {
    var (
        firstNumber,
        secondNumber,
        targetNumber
    ) = readln()
        .split(' ')
        .map { it.toLong() }
    if (firstNumber > secondNumber)
        firstNumber = secondNumber.also { secondNumber = firstNumber }
    print(
        getSummationOfAllNumbersFromMinimumNumberToMaximumNumberInclusiveAreDivisibleByTargetNumber(
            firstNumber,
            secondNumber,
            targetNumber
        )
    )
}

private fun getSummationOfAllNumbersFromMinimumNumberToMaximumNumberInclusiveAreDivisibleByTargetNumber(
    minimumNumber: Long,
    maximumNumber: Long,
    targetNumber: Long
) = (getSummationFromOneToTargetNumberInclusive(maximumNumber / targetNumber) * targetNumber) -
        (getSummationFromOneToTargetNumberInclusive((minimumNumber - 1) / targetNumber) * targetNumber)

private fun getSummationFromOneToTargetNumberInclusive(targetNumber: Long) = targetNumber * (targetNumber + 1) / 2