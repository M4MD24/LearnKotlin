package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_38_similar_ordered

fun main() {
    println(getLongestSimilarOrderedOrderedSubString("washing", "waiting"))
    println(getLongestSimilarOrderedOrderedSubString("me", "meet"))
    println(getLongestSimilarOrderedOrderedSubString("Reem", "Nouf"))
    print(getLongestSimilarOrderedOrderedSubString("abcdefggghi", "abcdefghirr"))
}

private fun getLongestSimilarOrderedOrderedSubString(firstText: String, secondText: String): String {
    val firstUniqueSortedCharactersText = firstText.toSortedSet().distinct().toCharArray()
    val secondUniqueSortedCharactersText = secondText.toSortedSet().distinct().toCharArray()
    val longestSimilarOrderedCharacters = findLongestSimilarOrderedSubString(firstUniqueSortedCharactersText, secondUniqueSortedCharactersText)
    return if (longestSimilarOrderedCharacters.isEmpty())
        "No matches found"
    else
        longestSimilarOrderedCharacters.toString()
}

private fun findLongestSimilarOrderedSubString(firstTextCharacter: CharArray, secondTextCharacter: CharArray): StringBuilder {
    var longestSimilarOrderedCharacters = StringBuilder()
    var currentSimilarOrderedCharacters = StringBuilder()
    for (round in firstTextCharacter.indices) {
        val currentCharacter = firstTextCharacter[round]
        var isCurrentCharacterSameAnotherCharacter = false
        val isContainCurrentCharacterInCurrentSimilarOrderedCharacters = longestSimilarOrderedCharacters.chars()
            .anyMatch { it == currentCharacter.code }
        if (!isContainCurrentCharacterInCurrentSimilarOrderedCharacters)
            for (anotherCharacter in secondTextCharacter) {
                if (firstTextCharacter[round] == anotherCharacter) {
                    currentSimilarOrderedCharacters.append(firstTextCharacter[round])
                    isCurrentCharacterSameAnotherCharacter = true
                    break
                }
            }
        else isCurrentCharacterSameAnotherCharacter = true
        if (!isCurrentCharacterSameAnotherCharacter || round == firstTextCharacter.size - 1) {
            if (currentSimilarOrderedCharacters.length > longestSimilarOrderedCharacters.length)
                longestSimilarOrderedCharacters = currentSimilarOrderedCharacters
            currentSimilarOrderedCharacters = StringBuilder()
        }
    }
    return longestSimilarOrderedCharacters
}