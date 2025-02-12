package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_9_octal_to_binary

fun main() = print(getBinaryNumberFromOctalNumber(readln().toInt()))

private fun getBinaryNumberFromOctalNumber(octalNumber: Int) = octalNumber
    .toString()
    .toInt(8)
    .toString(2)