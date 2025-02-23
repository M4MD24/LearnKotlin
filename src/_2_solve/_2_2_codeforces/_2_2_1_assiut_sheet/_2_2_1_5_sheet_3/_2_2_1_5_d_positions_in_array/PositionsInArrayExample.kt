package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_d_positions_in_array

fun main() {
    val countOfValues = readln()
    val numbers = readln()
        .split(' ')
        .map { it.toInt() }
    numbers.forEachIndexed { index, value ->
        if (value <= 10)
            println("A[$index] = $value")
    }
}