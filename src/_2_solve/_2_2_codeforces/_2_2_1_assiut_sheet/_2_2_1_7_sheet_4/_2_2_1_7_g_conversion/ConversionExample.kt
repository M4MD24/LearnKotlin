package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_g_conversion

fun main() {
    val text = readln()
    print(
        text
            .map {
                when {
                    it == ',' -> ' '
                    it.isUpperCase() -> it.lowercaseChar()
                    it.isLowerCase() -> it.uppercaseChar()
                    else -> it
                }
            }
            .joinToString("")
    )
}