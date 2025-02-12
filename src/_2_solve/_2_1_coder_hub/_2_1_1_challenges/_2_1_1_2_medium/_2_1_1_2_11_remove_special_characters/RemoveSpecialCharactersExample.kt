package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_11_remove_special_characters

fun main() = print(getTextAfterRemoveSpecialCharacters(readln()))

private fun getTextAfterRemoveSpecialCharacters(text: String) = text.replace(
    "[^\\w\\s-ـ]".toRegex(),
    ""
)