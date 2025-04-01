package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_b_delete_from_the_left

fun main() {
    val firstText = readln()
    val secondText = readln()

    var firstTextIndex = firstText.length - 1
    var secondTextIndex = secondText.length - 1
    var commonSuffixLength = 0

    while (
        firstTextIndex >= 0 &&
        secondTextIndex >= 0 &&
        firstText[firstTextIndex--] == secondText[secondTextIndex--]
    )
        commonSuffixLength++

    print(firstText.length + secondText.length - 2 * commonSuffixLength)
}