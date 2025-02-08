package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_53_root_check

fun main() = print(isSquareNumber(readln().toDouble(), readln().toInt()))

private fun isSquareNumber(squareNumber: Double, number: Int) = if (Math.sqrt(squareNumber) == number.toDouble())
    number
else
    0