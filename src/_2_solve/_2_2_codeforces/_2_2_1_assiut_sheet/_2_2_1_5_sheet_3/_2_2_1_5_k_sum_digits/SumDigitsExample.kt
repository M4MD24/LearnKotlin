package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_k_sum_digits

fun main() {
    val countOfDigits = readln()
    val digits = readln()
    var sumOfDigits = 0
    digits.forEach { sumOfDigits += it.digitToInt() }
    print(sumOfDigits)
}