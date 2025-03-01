package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_x_comparison

fun main() {
    val text = readln()
    var minimumText = text
    for (index in 1..<text.length) {
        val firstPartText = text
            .substring(
                0,
                index
            )
            .toCharArray()
            .sorted()
            .joinToString("")
        val secondPartText = text
            .substring(index)
            .toCharArray()
            .sorted()
            .joinToString("")
        val mergedPartsTexts = firstPartText + secondPartText
        if (mergedPartsTexts < minimumText)
            minimumText = mergedPartsTexts
    }
    print(minimumText)
}