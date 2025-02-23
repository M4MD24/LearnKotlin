package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_n_char

fun main() {
    val letter = readln()[0].code
    val conditionLetter = letter in 65..90
    val changeCase = (
            if (conditionLetter)
                letter + 32
            else
                letter - 32
            ).toChar()
    print(changeCase)
}