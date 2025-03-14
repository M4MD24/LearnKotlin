package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_l_greatest_common_divisor

fun main() {
    val (firstNumber, secondNumber) = readln()
        .split(' ')
        .map { it.toShort() }
    print(getGreatestCommonDivisor(firstNumber, secondNumber))
}

private tailrec fun getGreatestCommonDivisor(
    firstNumber: Short,
    secondNumber: Short
): Short = if (secondNumber == (0).toShort())
    firstNumber
else
    getGreatestCommonDivisor(
        secondNumber,
        (firstNumber % secondNumber).toShort()
    )