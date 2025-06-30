package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_79_count_vowels

fun main() = print(countVowels("Hello World!"))

private fun countVowels(text : String) = text.count { it.lowercaseChar() in "aeiou" }