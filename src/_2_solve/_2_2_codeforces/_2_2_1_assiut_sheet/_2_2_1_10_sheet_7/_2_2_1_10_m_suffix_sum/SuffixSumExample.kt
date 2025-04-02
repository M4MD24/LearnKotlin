package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_m_suffix_sum

fun main() {
    val (
        countOfNumbers,
        countOfTargetNumbersToSum
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val numbers = readln()
        .split(' ')
        .map { it.toInt() }
    print(
        getSuffixSum(
            numbers,
            countOfNumbers - 1,
            countOfTargetNumbersToSum
        )
    )
}

private fun getSuffixSum(
    numbers: List<Int>,
    countOfNumbers: Int,
    countOfTargetNumbersToSum: Int
): Long = if (countOfTargetNumbersToSum == 0)
    0
else numbers[countOfNumbers] +
        getSuffixSum(
            numbers,
            countOfNumbers - 1,
            countOfTargetNumbersToSum - 1
        )