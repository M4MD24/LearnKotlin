package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_a_one_to_number

fun main() = printToTargetNumber(readln().toInt())

private fun printToTargetNumber(targetNumber: Int) = print((1..targetNumber).joinToString("\n"))