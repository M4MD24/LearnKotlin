package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_n_numbers_histogram

fun main() {
    val symbol = readln()
    readln()
    val numbers = readln()
        .split(' ')
        .map { it.toByte() }
    print(numbers.joinToString("\n") { symbol.repeat(it.toInt()) })
}