package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_m_capital_or_small_or_digit

const val IS_DIGIT = "IS DIGIT"
const val ALPHA_WORD = "ALPHA"
const val IS_SMALL_WORD = "IS SMALL"
const val IS_CAPITAL_WORD = "IS CAPITAL"

fun main() {
    val letter = readln()[0].code
    val conditionDigit = letter in 48..57
    val conditionCapital = letter in 65..90
    val conditionAlpha = letter in 65..122
    var result = ""
    if (conditionDigit)
        result = IS_DIGIT
    else if (conditionAlpha) {
        result = ALPHA_WORD + "\n"
        result += if (conditionCapital)
            IS_CAPITAL_WORD
        else
            IS_SMALL_WORD
    }
    print(result)
}