package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_6_is_even_or_odd

fun main() = print(isEvenOrOdd(readln().toInt()))

private fun isEvenOrOdd(number: Int) = if (number % 2 == 0)
    "even"
else
    "odd"