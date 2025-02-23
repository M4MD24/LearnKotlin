package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_e_max

fun main() {
    readln()
    val numbers = readln().split(' ').map { it.toInt() }
    print(numbers.maxOf { it })
}