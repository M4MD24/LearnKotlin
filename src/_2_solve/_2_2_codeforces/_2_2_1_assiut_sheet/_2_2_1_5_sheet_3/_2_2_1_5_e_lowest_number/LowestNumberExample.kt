package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_e_lowest_number

fun main() {
    val countOfValues = readln().toInt()
    val values = readln()
        .split(' ')
        .map { it.toInt() }
    val minimumValue = values.minOrNull()!!
    print("$minimumValue ${values.indexOf(minimumValue) + 1}")
}