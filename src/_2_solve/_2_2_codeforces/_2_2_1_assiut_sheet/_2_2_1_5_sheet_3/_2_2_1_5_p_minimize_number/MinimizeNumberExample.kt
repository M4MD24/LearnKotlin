package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_p_minimize_number

fun main() {
    val countOfValues = readln()
    val values = readln()
        .split(' ')
        .map { it.toInt() }
    print(values.minOf { Integer.numberOfTrailingZeros(it) })
}