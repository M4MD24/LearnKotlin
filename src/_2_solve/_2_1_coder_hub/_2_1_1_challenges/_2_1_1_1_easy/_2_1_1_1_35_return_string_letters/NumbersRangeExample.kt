package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_35_return_string_letters

fun main() = print(printNumbersToTargetNumber(readln(), readln()))

private fun printNumbersToTargetNumber(firstText: String, secondText: String) = firstText.length.coerceAtLeast(secondText.length)