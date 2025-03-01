package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_f_way_too_long_words

fun main() {
    val countOfTexts = readln().toInt()
    repeat(countOfTexts) {
        val text = readln()
        println(
            if (text.length > 10)
                "${text.first()}${text.length - 2}${text.last()}"
            else
                text
        )
    }
}