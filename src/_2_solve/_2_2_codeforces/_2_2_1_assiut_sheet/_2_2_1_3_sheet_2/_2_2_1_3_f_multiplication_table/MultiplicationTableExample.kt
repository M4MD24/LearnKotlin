package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_f_multiplication_table

fun main() {
    val targetNumber = readln().toByte()
    for (number in 1..12)
        println("$targetNumber * $number = ${targetNumber * number}")
}