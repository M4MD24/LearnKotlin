package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_16_longest_zero

fun main() = print(getLongestZero(readln()))

private fun getLongestZero(number: String) = Regex("0+")
    .findAll(number)
    .maxByOrNull { it.value.length }
    ?.value
    ?: ""