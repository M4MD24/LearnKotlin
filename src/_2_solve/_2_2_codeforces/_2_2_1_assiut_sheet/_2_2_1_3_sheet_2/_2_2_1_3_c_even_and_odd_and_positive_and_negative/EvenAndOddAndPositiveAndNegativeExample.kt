package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_c_even_and_odd_and_positive_and_negative

fun main() {
    readln().toShort()
    val numbers = readln()
        .split(' ')
        .map { it.toInt() }
    print(
        """
        ${numbers.filter { it.isEvenNumber() }}
        ${numbers.filter { it.isOddNumber() }}
        ${numbers.filter { it.isPositiveNumber() }}
        ${numbers.filter { it.isNegativeNumber() }}"""
    )
}

private fun Int.isEvenNumber(): Boolean = this % 2 == 0

private fun Int.isOddNumber(): Boolean = this % 2 != 0

private fun Int.isPositiveNumber(): Boolean = this % 2 != 0

private fun Int.isNegativeNumber(): Boolean = this % 2 != 0