package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_v_new_password

fun main() {
    val (
        length,
        uniqueChars
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    print(generatePassword(length, uniqueChars))
}

private fun generatePassword(
    textLength: Byte,
    uniqueCharacters: Byte
) = List(textLength.toInt()) { ('a' + it % uniqueCharacters) }.joinToString("")

/*
private fun generatePassword(
    length: Byte,
    uniqueCharacters: Byte
): String {
    val characters = ('a'..<'a' + uniqueCharacters.toInt()).toList()
    return buildString {
        for (index in 0..<length)
            append(characters[index % uniqueCharacters])
    }
}
*/