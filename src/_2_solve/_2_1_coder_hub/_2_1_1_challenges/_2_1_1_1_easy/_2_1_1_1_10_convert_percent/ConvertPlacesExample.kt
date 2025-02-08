package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_10_convert_percent

fun main() = print(convertPercent(readln()))

private fun convertPercent(percentage: String) = percentage.replace("%", "").toDouble() / 100