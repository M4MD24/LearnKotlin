package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_w_mahmoud_and_longest_uncommon_subsequence

fun main() {
    val firstText = readln()
    val secondText = readln()
    print(
        if (firstText == secondText)
            -1
        else
            maxOf(
                firstText.length,
                secondText.length
            )
    )
}