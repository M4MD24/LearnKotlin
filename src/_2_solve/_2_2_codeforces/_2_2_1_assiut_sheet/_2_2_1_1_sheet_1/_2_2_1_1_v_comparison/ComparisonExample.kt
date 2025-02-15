package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_v_comparison

fun main() {
    val line = readln().split(' ')
    val firstNumber = line[0].toByte()
    val logicalOperator = line[1][0]
    val secondNumber = line[2].toByte()
    print(
        getResultOfCompareNumbers(
            firstNumber,
            logicalOperator,
            secondNumber
        )
    )
}

private fun getResultOfCompareNumbers(
    firstNumber: Byte,
    logicalOperator: Char,
    secondNumber: Byte
) = when (logicalOperator) {
    '>' -> if (firstNumber > secondNumber)
        "Right"
    else
        "Wrong"

    '<' -> if (firstNumber < secondNumber)
        "Right"
    else
        "Wrong"

    '=' -> if (firstNumber == secondNumber)
        "Right"
    else
        "Wrong"

    else -> ""
}