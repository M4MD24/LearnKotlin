package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_7_binary_to_octal

fun main() = print(getOctalNumberFromBinaryNumber(readln()))

private fun getOctalNumberFromBinaryNumber(binaryNumber: String) = binaryNumber
    .toInt(2)
    .toString(8)
    .toInt()