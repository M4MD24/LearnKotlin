package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_8_sheet_5._2_2_1_8_h_n_times

fun main() {
    val countOfCases = readln().toShort()
    repeat(countOfCases.toInt()) {
        val line = readln().split(' ')
        val letterCount = line[0].toByte()
        val letter = line[1][0]
        val letters = getLetters(
            letter,
            letterCount
        )
        println(letters.joinToString(" "))
    }
}

private fun getLetters(
    letter: Char,
    letterCount: Byte
) = List(letterCount.toInt()) { letter }