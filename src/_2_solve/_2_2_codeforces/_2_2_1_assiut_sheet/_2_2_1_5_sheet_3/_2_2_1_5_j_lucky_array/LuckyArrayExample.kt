package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_j_lucky_array

fun main() {
    val countOfValues = readln()
    val values = readln()
        .split(' ')
        .map { it.toInt() }
    val minimumValue = values.minOrNull()
    val countOfMinimumValue = values.count { it == minimumValue }
    println(
        if (countOfMinimumValue % 2 == 1)
            "Lucky"
        else
            "Unlucky"
    )
}