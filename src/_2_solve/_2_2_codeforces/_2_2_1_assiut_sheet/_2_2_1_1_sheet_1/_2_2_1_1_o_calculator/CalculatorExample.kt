package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_o_calculator

fun main() {
    val line = readln()
    val operator = line
        .find { it in "[+\\-*/]" }!!
    val (firstNumber, secondNumber) = line
        .split(operator)
        .map { it.toInt() }
    print(
        resultOfTwoNumbers(
            firstNumber,
            secondNumber,
            operator
        )
    )
}

private fun resultOfTwoNumbers(
    firstNumber: Int,
    secondNumber: Int,
    operator: Char
) = when (operator) {
    '+' -> firstNumber + secondNumber
    '-' -> firstNumber - secondNumber
    '*' -> firstNumber * secondNumber
    '/' -> firstNumber / secondNumber
    else -> null
}