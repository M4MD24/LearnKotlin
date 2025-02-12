package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_3_arrow_duplicates

fun main() = print(getArrowDuplicates(readln()))

private fun getArrowDuplicates(word: String): String {
    val arrowDuplicates = StringBuilder()
    val wordAsStringBuilder = StringBuilder(word.lowercase())
    for (index in 0 until word.length) {
        val character = wordAsStringBuilder[index]
        wordAsStringBuilder.deleteCharAt(index)
        if (wordAsStringBuilder.toString().contains(character.toString()))
            arrowDuplicates.append('<')
        else
            arrowDuplicates.append('>')
        wordAsStringBuilder.insert(index, character)
    }
    return arrowDuplicates.toString()
}