package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_6_contest_3_1._2_2_1_6_d_counting_elements

fun main() {
    val countOfValues = readLine()
    val values = readln()
        .split(' ')
        .map { it.toShort() }
    val uniqueValues = values.toSet()
    print(values.count { (it + 1).toShort() in uniqueValues })
}