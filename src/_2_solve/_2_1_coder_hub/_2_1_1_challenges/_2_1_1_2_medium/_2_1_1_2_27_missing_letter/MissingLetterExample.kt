package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_27_missing_letter

fun main() = print(getMissingLetter(readln()))

private fun getMissingLetter(text: String): String {
    for (index in 0 until text.length - 1)
        if (text[index + 1] - text[index] > 1)
            return (text[index] + 1).toString()
    return "No Missing Letter"
}

// >
/*
private fun getMissingLetter(text: String): String {
    val missingLetters = StringBuilder()
    var lastCharacter = text[0]
    var index = 0
    while (index < text.length) {
        val currentCharacter = text[index]
        while (currentCharacter != lastCharacter)
            missingLetters.append(lastCharacter++)
        index++
        lastCharacter++
    }
    return if (missingLetters.isEmpty())
        "No Missing Letter"
    else
        missingLetters.toString()
}
*/