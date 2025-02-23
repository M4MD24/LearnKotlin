package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_n_check_code

fun main() {
    val (
        targetFirstPartLength,
        targetSecondPartLength
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val parts = readln()
        .split('-')
    print(
        if (
            parts.size == 2 &&
            parts[0].length.toByte() == targetFirstPartLength &&
            parts[1].length.toByte() == targetSecondPartLength
        )
            "Yes"
        else
            "No"
    )
}