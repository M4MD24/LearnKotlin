package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_z_decoding

fun main() {
    val countOfLetters = readln().toShort()
    val text = readln()
    print(polycarpEncode(text))
}

private fun polycarpEncode(encodedText: String): String {
    val reversedText = encodedText.reversed()
    val evenIndexCharacters = reversedText.filterIndexed { index, character -> index % 2 == 0 }
    val oddIndexCharacters = reversedText.filterIndexed { index, character -> index % 2 == 1 }
    return oddIndexCharacters + evenIndexCharacters.reversed()
}

// >
/*
private fun polycarpEncode(originalText: String): String {
    val textBeforeEncoded = StringBuilder(originalText)
    val textAfterEncoded = StringBuilder()
    var originalTextLength = originalText.length
    var index: Short = 0
    while (originalTextLength > 0) {
        if (originalTextLength-- % 2 == 0)
            textAfterEncoded.insert(0, textBeforeEncoded[index.toInt()])
        else
            textAfterEncoded.append(textBeforeEncoded[index.toInt()])
        index++
    }
    return textAfterEncoded.toString()
}
*/