package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_k_i_love_strings

fun main() {
    val countOfValues = readln().toByte()
    repeat(countOfValues.toInt()) {
        val (firstText, secondText) = readln()
            .split(' ')
        val minimumLength = minOf(
            firstText.length,
            secondText.length
        ).toByte()
        for (index in 0..<minimumLength)
            print("${firstText[index]}${secondText[index]}")
        println(firstText.substring(minimumLength.toInt()) + secondText.substring(minimumLength.toInt()))
    }
}