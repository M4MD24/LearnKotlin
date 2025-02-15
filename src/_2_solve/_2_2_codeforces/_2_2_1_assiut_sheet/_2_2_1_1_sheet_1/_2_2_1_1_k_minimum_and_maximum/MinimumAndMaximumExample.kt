package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_k_minimum_and_maximum

fun main() {
    val line = readln().split(' ')
    val firstNumber = line[0].toLong()
    val secondNumber = line[1].toLong()
    val thirdNumber = line[2].toLong()
    print("${getMinimumNumber(firstNumber, secondNumber, thirdNumber)} ${getMaximumNumber(firstNumber, secondNumber, thirdNumber)}")
}

private fun getMinimumNumber(
    firstNumber: Long,
    secondNumber: Long,
    thirdNumber: Long
) = if (
    firstNumber <= secondNumber &&
    firstNumber <= thirdNumber
)
    firstNumber
else if (
    secondNumber <= firstNumber &&
    secondNumber <= thirdNumber
)
    secondNumber
else
    thirdNumber

private fun getMaximumNumber(
    firstNumber: Long,
    secondNumber: Long,
    thirdNumber: Long
) = if (
    firstNumber >= secondNumber &&
    firstNumber >= thirdNumber
)
    firstNumber
else if (
    secondNumber >= firstNumber &&
    secondNumber >= thirdNumber
)
    secondNumber
else
    thirdNumber