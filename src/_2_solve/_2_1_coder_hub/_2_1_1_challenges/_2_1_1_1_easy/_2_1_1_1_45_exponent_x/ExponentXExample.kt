package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_45_exponent_x

fun main() = print(exponentX(readln().toInt(), readln().toInt()))

private fun exponentX(number: Int, exponent: Int) = Math.pow(number.toDouble(), exponent.toDouble()).toInt()