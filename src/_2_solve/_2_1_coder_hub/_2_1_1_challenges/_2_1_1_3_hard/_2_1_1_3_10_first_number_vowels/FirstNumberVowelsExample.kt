package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_10_first_number_vowels

fun main() = print(getFirstNumberVowels(readln(), readln().toInt()))

const val VOWELS = "AEIOUaeiou"
private fun getFirstNumberVowels(text: String, targetNumber: Int): String {
    val textAfterClearSpaces = text.replace(
        " +".toRegex(),
        ""
    )
    val firstVowels = StringBuilder()
    for (character in textAfterClearSpaces.toCharArray())
        if (VOWELS.contains(character.toString()))
            firstVowels.append(character)
    return if (firstVowels.length > targetNumber)
        "Invalid"
    else
        firstVowels.toString()
}