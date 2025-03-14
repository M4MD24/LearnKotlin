package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_s_good_number

fun main() {
    val (
        countOfCases,
        maximumDigit
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val requiredDigits = (0..maximumDigit)
        .map { it.digitToChar() }
        .toSet()
    var goodNumberCount = 0
    repeat(countOfCases.toInt()) {
        val numberDigits = readln().toSet()
        if (requiredDigits.all { it in numberDigits })
            goodNumberCount++
    }
    print(goodNumberCount)
}