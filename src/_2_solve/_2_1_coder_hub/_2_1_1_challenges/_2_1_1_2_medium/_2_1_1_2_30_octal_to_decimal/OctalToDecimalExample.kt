package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_30_octal_to_decimal

fun main() = print(getDecimalNumberFromOctalNumber(readln().toInt()))

private fun getDecimalNumberFromOctalNumber(octalNumber: Int) = octalNumber
    .toString()
    .toInt(8)