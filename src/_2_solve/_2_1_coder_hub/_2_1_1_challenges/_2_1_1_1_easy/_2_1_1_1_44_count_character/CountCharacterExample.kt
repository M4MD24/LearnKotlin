package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_44_count_character

fun main() = print(countCharacter(readln(), readln()))

private fun countCharacter(text: String, subText: String) = text.count { character -> character.toString() == subText }