package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_5_count_words

fun main() = print(getCountWords(readln()))

private fun getCountWords(text: String) = text.split(' ').size