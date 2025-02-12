package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_29_compare_two_words

fun main() = print(compareTwoWords(readln(), readln()))

private fun compareTwoWords(firstText: String, secondText: String) = firstText.substring(firstText.length - 2) == secondText.substring(secondText.length - 2)