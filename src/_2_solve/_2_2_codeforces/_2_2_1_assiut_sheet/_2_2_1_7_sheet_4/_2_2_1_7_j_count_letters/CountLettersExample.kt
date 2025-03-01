package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_j_count_letters

const val COUNT_OF_ENGLISH_LETTERS = 26
val countOfLowerCaseLetters = IntArray(COUNT_OF_ENGLISH_LETTERS)
const val START_CHARACTER = 'a'

fun main() {
    val text = readln()
    calculateCountOfCharacters(text)
    printCountOfCharacters()
}

private fun printCountOfCharacters() {
    for (index in 0..<26) {
        val countOfCurrentCharacter = countOfLowerCaseLetters[index]
        if (countOfCurrentCharacter > 0) {
            val currentCharacter = (index + START_CHARACTER.code).toChar()
            println("$currentCharacter : $countOfCurrentCharacter")
        }
    }
}

private fun calculateCountOfCharacters(text: String) {
    for (character in text)
        countOfLowerCaseLetters[character - START_CHARACTER]++
}