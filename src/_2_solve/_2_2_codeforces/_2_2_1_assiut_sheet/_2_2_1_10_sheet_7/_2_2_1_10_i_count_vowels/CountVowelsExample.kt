package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_i_count_vowels

const val lowerCaseVowelLetters = "aeiou"

fun main() {
    val text = readln()
    println(countVowels(text.lowercase()))
}

private fun countVowels(
    text: String,
    currentTextIndex: Short = 0
): Int {
    if (currentTextIndex == text.length.toShort())
        return 0
    return (
            if (text[currentTextIndex.toInt()] in lowerCaseVowelLetters)
                1
            else
                0
            ) + countVowels(text, (currentTextIndex + 1).toShort())
}

// >
/*
val vowelLetters = ".*[aAeEiIoOuU].*".toRegex()

fun main() {
    val text = readln()
    print(getVowelLettersCount(text))
}

private fun getVowelLettersCount(
    text: String,
    currentTextIndex: Short = 0,
    currentVowelLettersCount: Short = 0
): Short {
    if (currentTextIndex == text.length.toShort())
        return currentVowelLettersCount
    return getVowelLettersCount(
        text,
        (currentTextIndex + 1).toShort(),
        if (text[currentTextIndex.toInt()].toString().matches(vowelLetters))
            (currentVowelLettersCount + 1).toShort()
        else
            currentVowelLettersCount
    )
}
*/