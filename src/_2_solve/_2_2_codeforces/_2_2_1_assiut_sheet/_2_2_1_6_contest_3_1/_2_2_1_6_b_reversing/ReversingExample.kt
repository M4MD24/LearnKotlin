package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_6_contest_3_1._2_2_1_6_b_reversing

fun main() {
    val countOfValues = readln().toShort()
    val values = readln()
        .split(' ')
        .map { it.toInt() }
        .toMutableList()
    for (index in values.indices)
        if (values[index] == 0)
            values.subList(
                0,
                index
            ).reverse()
    print(values.joinToString(" "))
}