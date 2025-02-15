package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_w_mathematical_exepression

fun main() {
    val line = readln().split(' ')
    val firstNumber = line[0].toInt()
    val arithmeticOperator = line[1][0]
    val secondNumber = line[2].toInt()
    line[3]
    val manualResult = line[4].toInt()
    print(isCorrectMathematicalExpression(firstNumber, arithmeticOperator, secondNumber, manualResult))
}

private fun isCorrectMathematicalExpression(
    firstNumber: Int,
    arithmeticOperator: Char,
    secondNumber: Int,
    manualResult: Int
): Any {
    val correctResult: Int
    return when (arithmeticOperator) {
        '+' -> {
            correctResult = firstNumber + secondNumber
            if (manualResult == correctResult)
                "Yes"
            else
                correctResult
        }

        '-' -> {
            correctResult = firstNumber - secondNumber
            if (manualResult == correctResult)
                "Yes"
            else
                correctResult
        }

        '*' -> {
            correctResult = firstNumber * secondNumber
            if (manualResult == correctResult)
                "Yes"
            else
                correctResult
        }

        else -> ""
    }
}