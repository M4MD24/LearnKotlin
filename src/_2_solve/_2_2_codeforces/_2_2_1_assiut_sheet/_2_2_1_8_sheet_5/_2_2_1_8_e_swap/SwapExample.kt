package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_8_sheet_5._2_2_1_8_e_swap

fun main() {
    val (
        firstValue,
        secondValue
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    printSwap(
        firstValue,
        secondValue
    )
}

private fun printSwap(
    firstValue: Int,
    secondValue: Int
) = print("$secondValue $firstValue")