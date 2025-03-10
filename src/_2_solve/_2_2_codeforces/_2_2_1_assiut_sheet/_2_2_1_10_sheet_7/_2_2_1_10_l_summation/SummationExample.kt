package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_l_summation

fun main() {
    val countOFNumbers = readln().toShort()
    val numbers = readln()
        .split(' ')
        .map { it.toInt() }
    print(
        getSummationOfNumbers(
            numbers,
            countOFNumbers - 1
        )
    )
}

private fun getSummationOfNumbers(
    numbers: List<Int>,
    currentNumbersIndex: Int
): Long = if (currentNumbersIndex == -1)
    0
else
    numbers[currentNumbersIndex] +
            getSummationOfNumbers(
                numbers,
                currentNumbersIndex - 1
            )