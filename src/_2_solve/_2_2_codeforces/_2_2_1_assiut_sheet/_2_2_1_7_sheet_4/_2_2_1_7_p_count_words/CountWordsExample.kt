package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_p_count_words

fun main() {
    val text = readln()
    val texts = text
        .split("[ !.,?]+".toRegex())
        .filter { it.isNotEmpty() }
    print(texts.size)
}