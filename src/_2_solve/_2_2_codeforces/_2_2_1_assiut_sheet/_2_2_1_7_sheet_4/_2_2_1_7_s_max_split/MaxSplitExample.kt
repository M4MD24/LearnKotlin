package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_s_max_split

fun main() {
    val text = readln()
    var balance = 0
    var count = 0
    val balancedTexts = mutableListOf<String>()
    val temporaryCharacters = StringBuilder()
    for (character in text) {
        temporaryCharacters.append(character)
        balance += if (character == 'L')
            1
        else
            -1
        if (balance == 0) {
            balancedTexts.add(temporaryCharacters.toString())
            temporaryCharacters.clear()
            count++
        }
    }
    println(count)
    balancedTexts.forEach { println(it) }
}