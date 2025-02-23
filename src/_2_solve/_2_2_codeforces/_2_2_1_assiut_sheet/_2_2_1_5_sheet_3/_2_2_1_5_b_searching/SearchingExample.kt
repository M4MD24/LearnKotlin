package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_b_searching

fun main() {
    val countOfValues = readln()
    val numbers = readln()
        .split(' ')
        .map { it.toInt() }
    val targetValue = readln().toInt()
    print(numbers.indexOf(targetValue))
}