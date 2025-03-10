package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_q_three_n_plus_one_sequence

fun main() {
    val number = readln().toInt()
    println(getCollatzSequenceLength(number))
}

private fun getCollatzSequenceLength(number: Int): Int = if (number == 1)
    1
else 1 + getCollatzSequenceLength(
    if (number % 2 == 0)
        number / 2
    else
        3 * number + 1
)