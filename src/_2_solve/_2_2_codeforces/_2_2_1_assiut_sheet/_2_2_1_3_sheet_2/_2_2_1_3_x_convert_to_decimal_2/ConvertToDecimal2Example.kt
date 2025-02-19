package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_x_convert_to_decimal_2

fun main() {
    val countOfValues = readln().toByte()
    repeat(countOfValues.toInt()) {
        val value = readln().toInt()
        val onesCount = Integer.bitCount(value)
        println((1 shl onesCount) - 1)
    }
}