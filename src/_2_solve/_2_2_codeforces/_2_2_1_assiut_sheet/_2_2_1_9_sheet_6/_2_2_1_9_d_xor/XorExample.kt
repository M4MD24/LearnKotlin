package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_d_xor

fun main() {
    val (
        firstNumber,
        secondNumber,
        position
    ) = readln()
        .split(' ')
        .map { it.toLong() }
    print(
        when (position % 3) {
            1L -> firstNumber
            2L -> secondNumber
            else -> firstNumber xor secondNumber
        }
    )
}