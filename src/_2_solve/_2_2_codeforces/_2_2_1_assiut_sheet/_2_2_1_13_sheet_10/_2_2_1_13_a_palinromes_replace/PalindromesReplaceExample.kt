package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_a_palinromes_replace

fun main() {
    val text = readln()
    val smallestPalindrome = text
        .reversed()
        .zip(text)
        .map { (mirroredCharacter, originalCharacter) ->
            when {
                mirroredCharacter == originalCharacter -> mirroredCharacter
                mirroredCharacter == '?' -> originalCharacter
                originalCharacter == '?' -> mirroredCharacter
                else -> return print(-1)
            }
        }.joinToString("")
        .replace('?', 'a')
    print(smallestPalindrome)
}

// >
/*
fun main() = println(getSmallestPalindrome(readln()))

private fun getSmallestPalindrome(text: String): String {
    val textCharacter = text.toCharArray()
    val textLength = textCharacter.size

    for (index in 0..<textLength / 2) {
        val leftCharacter = textCharacter[index]
        val rightCharacter = textCharacter[textLength - index - 1]
        if (leftCharacter == '?' && rightCharacter == '?') {
            textCharacter[index] = 'a'
            textCharacter[textLength - index - 1] = 'a'
        } else if (leftCharacter == '?')
            textCharacter[index] = rightCharacter
        else if (rightCharacter == '?')
            textCharacter[textLength - index - 1] = leftCharacter
        else if (leftCharacter != rightCharacter)
            return "-1"
    }

    if (
        textLength % 2 == 1 &&
        textCharacter[textLength / 2] == '?'
    )
        textCharacter[textLength / 2] = 'a'

    return String(textCharacter)
}
*/