package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_30_is_mirrored

fun main() = print(isPalindromeNumbers(readln().toInt()))

private fun isPalindromeNumbers(number: Int) = number.toString().contentEquals(StringBuilder(number.toString()).reverse())