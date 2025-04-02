package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_a_palinromes_replace

fun main() {
    val text = readln()
    print(getTextAfterReplaceQuestionMarks(text))
}

private fun getTextAfterReplaceQuestionMarks(text: String): String {
    val characters = text.toCharArray()
    var left = 0
    var right = text.length - 1
    while (left <= right) {
        when {
            characters[left] == characters[right] && characters[left] == '?' -> {
                characters[left] = 'a'
                characters[right] = 'a'
            }

            characters[left] == '?' -> characters[left] = characters[right]

            characters[right] == '?' -> characters[right] = characters[left]

            characters[left] != characters[right] -> return "-1"
        }
        left++
        right--
    }
    return String(characters)
}