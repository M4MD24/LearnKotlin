package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_48_left_digit

fun main() = print(leftDigit(readln()))

private fun leftDigit(text: String) = text
    .firstOrNull { it.isDigit() }
    ?.digitToInt() ?: 0

// > Another Solution
/*
private fun leftDigit(text: String) = "\\d"
    .toRegex()
    .find(text)
    ?.value
    ?.toInt() ?: 0
*/
