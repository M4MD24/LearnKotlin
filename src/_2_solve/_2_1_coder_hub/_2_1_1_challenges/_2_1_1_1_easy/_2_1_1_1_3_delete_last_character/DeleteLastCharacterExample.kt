package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_3_delete_last_character

fun main() = print(deleteLastCharacter(readln()))

private fun deleteLastCharacter(text: String) = StringBuilder(text)
    .deleteCharAt(text.length - 1)
    .toString()