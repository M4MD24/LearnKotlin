package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_16_convert_to_seconds

fun main() = print(getSecondsFromHours(readln().toInt()))

private fun getSecondsFromHours(hours: Int) = hours * 60 * 60