package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_39_all_same_case

fun main() = print(allSameCase(readln()))

private fun allSameCase(text: String) = text == text.lowercase() || text == text.uppercase()