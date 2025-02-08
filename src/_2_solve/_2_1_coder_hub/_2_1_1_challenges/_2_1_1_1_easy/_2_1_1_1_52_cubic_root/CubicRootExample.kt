package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_52_cubic_root

fun main() = print(getCubeRoot(readln().toInt()))

private fun getCubeRoot(number: Int) = Math.cbrt(number.toDouble())