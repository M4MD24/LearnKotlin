package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_d_hussein_and_strings

fun main() {
    val firstText = readln()
    val secondText = readln()
    print(
        if (canSwapToMatch(firstText, secondText))
            "YES"
        else
            "NO"
    )
}

private fun canSwapToMatch(
    firstText: String,
    secondText: String
) = if (firstText.length != secondText.length)
    false
else if (firstText == secondText)
    firstText.toSet().size != firstText.length
else {
    val differenceIndices = firstText.indices.filter { firstText[it] != secondText[it] }
    differenceIndices.size == 2 &&
            firstText[differenceIndices[0]] == secondText[differenceIndices[1]] &&
            firstText[differenceIndices[1]] == secondText[differenceIndices[0]]
}

// >
/*
fun main() {
    val firstText = readln()
    val secondText = readln()
    print(
        if (canHusseinSwitch(StringBuffer(firstText), StringBuffer(secondText)))
            "YES"
        else
            "NO"
    )
}

private fun canHusseinSwitch(
    firstText: StringBuffer,
    secondText: StringBuffer
): Boolean {
    if (firstText.length != secondText.length)
        return false
    else {
        if (firstText.toString() == secondText.toString()) {
            val uniqueCharacters: HashSet<Char> = HashSet()
            for (index in firstText.indices)
                uniqueCharacters.add(firstText[index])
            return uniqueCharacters.size != firstText.length
        } else {
            var difference: Byte = 0
            var firstCharacterIndex = 0
            var lastCharacterIndex = 1
            var counter = 0
            var firstCharacterDifferent = false
            for (index in firstText.indices) {
                if (firstText[index] != secondText[index]) {
                    difference++
                    counter++
                }
                if (difference.toInt() == 1 && !firstCharacterDifferent) {
                    firstCharacterIndex = index
                    firstCharacterDifferent = true
                }
                if (difference.toInt() == 2) {
                    lastCharacterIndex = index
                    break
                }
            }
            if (counter == 2) {
                val temporaryCharacter = firstText[firstCharacterIndex]
                firstText.setCharAt(firstCharacterIndex, firstText[lastCharacterIndex])
                firstText.setCharAt(lastCharacterIndex, temporaryCharacter)
                return firstText.toString() == secondText.toString()
            } else
                return false
        }
    }
}
*/