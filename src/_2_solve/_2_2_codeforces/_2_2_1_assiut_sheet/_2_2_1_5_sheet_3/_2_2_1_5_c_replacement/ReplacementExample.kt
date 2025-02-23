package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_c_replacement

fun main() {
    val countOfValues = readln()
    val numbers = readln()
        .split(' ')
        .map { it.toInt() }
        .map {
            if (it > 0)
                1
            else if (it < 0)
                2
            else
                0
        }
    print(numbers.joinToString(" "))
}