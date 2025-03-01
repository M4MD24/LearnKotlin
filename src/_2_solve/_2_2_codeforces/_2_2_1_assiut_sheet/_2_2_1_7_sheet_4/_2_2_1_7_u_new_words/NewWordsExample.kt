package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_u_new_words

fun main() {
    val text = readln().lowercase()
    val frequencyCharacters = text
        .groupingBy { it }
        .eachCount()
    print(listOf('e', 'g', 'y', 'p', 't').minOf {
        frequencyCharacters.getOrDefault(
            it,
            0
        )
    })
}