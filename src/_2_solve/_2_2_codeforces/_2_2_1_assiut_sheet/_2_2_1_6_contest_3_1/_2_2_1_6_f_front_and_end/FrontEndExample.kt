package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_6_contest_3_1._2_2_1_6_f_front_and_end

fun main() {
    val countOfValues = readln().toInt()
    val values = ArrayDeque(
        readln()
            .split(' ')
            .map { it.toInt() }
    )
    while (values.isNotEmpty()) {
        print("${values.removeFirst()} ")
        if (values.isNotEmpty())
            print("${values.removeLast()} ")
    }
}