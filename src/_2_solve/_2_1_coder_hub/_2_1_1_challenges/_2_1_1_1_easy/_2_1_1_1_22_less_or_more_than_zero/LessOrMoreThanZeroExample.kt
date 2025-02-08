package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_22_less_or_more_than_zero

fun main() = print(lessOrMoreThanZero(readln().toInt()))

private fun lessOrMoreThanZero(number: Int) = if (number == 0)
    "Equal to zero"
else if (number > 0)
    "Greater than zero"
else
    "Less than zero"