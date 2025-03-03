package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_8_sheet_5._2_2_1_8_l_new_array

fun main() {
    val countOfNumbers = readln().toShort()
    val secondNumbers = readln()
        .split(' ')
        .map { it.toInt() }
    val firstNumbers = readln()
        .split(' ')
        .map { it.toInt() }
    printNumbers(
        firstNumbers,
        secondNumbers
    )
}

private fun printNumbers(
    firstNumbers: List<Int>,
    secondNumbers: List<Int>
) = print("${firstNumbers.joinToString(" ")} ${secondNumbers.joinToString(" ")}")