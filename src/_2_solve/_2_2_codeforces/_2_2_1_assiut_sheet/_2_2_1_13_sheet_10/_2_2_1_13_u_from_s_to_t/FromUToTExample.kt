package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_u_from_s_to_t

fun main() {
    val countOfCases = readln().toByte()
    repeat(countOfCases.toInt()) {
        val (
            currentText,
            targetText,
            extraText
        ) = List(3) { readln() }
        println(
            if (
                canFormTarget(
                    currentText,
                    targetText,
                    extraText
                )
            )
                "YES"
            else
                "NO"
        )
    }
}

private fun canFormTarget(
    currentText: String,
    targetText: String,
    extraText: String
): Boolean {
    val hasSufficientCharacters = targetText.all {
        currentText.count(it::equals) +
                extraText.count(it::equals) >= targetText.count(it::equals)
    }
    val isSubSequence = targetText.fold(0) { index, character ->
        index + (index < currentText.length &&
                currentText[index] == character).compareTo(false)
    } == currentText.length
    return hasSufficientCharacters &&
            isSubSequence
}

// >
/*
private fun canFormTarget(
    currentText: String,
    targetText: String,
    textItWillBeTakenFromHim: String
): Boolean {
    val maximumCharacters = 26
    val currentTextCharacters = ShortArray(maximumCharacters)
    val targetTextCharacters = ByteArray(maximumCharacters)
    currentText.forEach { currentTextCharacters[it - 'a']++ }
    targetText.forEach { targetTextCharacters[it - 'a']++ }
    textItWillBeTakenFromHim.forEach { currentTextCharacters[it - 'a']++ }
    if (!targetTextCharacters.indices.all { currentTextCharacters[it] >= targetTextCharacters[it] })
        return false
    var currentIndexCharacterCheck = 0
    for (character in targetText)
        if (
            currentIndexCharacterCheck < currentText.length &&
            character == currentText[currentIndexCharacterCheck]
        )
            currentIndexCharacterCheck++
    return currentIndexCharacterCheck == currentText.length
}
*/