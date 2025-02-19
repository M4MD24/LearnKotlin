package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_m_lucky_number

fun main() {
    val (
        firstNumber,
        secondNumber
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val luckyNumbers = (firstNumber..secondNumber)
        .filter {
            it.toString()
                .matches(Regex("[47]+"))
        }
        .joinToString(" ")
    print(luckyNumbers.ifEmpty { "-1" })
}