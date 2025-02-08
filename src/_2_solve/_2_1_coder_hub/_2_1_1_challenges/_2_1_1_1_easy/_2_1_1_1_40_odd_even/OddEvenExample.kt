package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_40_odd_even

fun main() = print(oddEven(readln().toInt()))

private fun oddEven(number: Int) = if (number % 2 == 0)
    "زوجي"
else
    "فردي"