package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_m_sub_sequence_string

fun main() {
    val text = readln()
    val targetWord = "hello"
    var wordIndex = 0
    for (currentCharacter in text) {
        if (currentCharacter == targetWord[wordIndex])
            wordIndex++
        if (wordIndex == targetWord.length) {
            print("YES")
            return
        }
    }
    print("NO")
}