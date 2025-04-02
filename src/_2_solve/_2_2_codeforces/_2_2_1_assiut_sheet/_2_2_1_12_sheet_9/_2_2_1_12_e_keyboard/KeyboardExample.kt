package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_e_keyboard

fun main() {
    val shiftDirection = readln()
    val typedMessage = readln()

    val keyboardLayout = listOf(
        "qwertyuiop",
        "asdfghjkl;",
        "zxcvbnm,./"
    )

    val shiftAmount = if (shiftDirection == "R")
        -1
    else
        1
    val originalMessage = typedMessage.map { character ->
        keyboardLayout.find { row -> character in row }
            ?.let { row ->
                row[row.indexOf(character) + shiftAmount]
            } ?: character
    }.joinToString("")

    print(originalMessage)
}