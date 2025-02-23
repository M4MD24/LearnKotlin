package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_l_greatest_common_divisor

fun main() {
    val (firstNumber, secondNumber) = readln()
        .split(' ')
        .map { it.toShort() }
    print(greatestCommonDivisor(firstNumber, secondNumber))
}

tailrec fun greatestCommonDivisor(
    firstNumber: Short,
    secondNumber: Short
): Short = if (secondNumber == (0).toShort())
    firstNumber
else
    greatestCommonDivisor(
        secondNumber,
        (firstNumber % secondNumber).toShort()
    )