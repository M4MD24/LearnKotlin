package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_f_reversing

fun main() {
    val countOfValues = readln()
    val reversedValues = readln()
        .split(' ')
        .map { it.toInt() }
        .reversed()
    print(reversedValues.joinToString(" "))
}