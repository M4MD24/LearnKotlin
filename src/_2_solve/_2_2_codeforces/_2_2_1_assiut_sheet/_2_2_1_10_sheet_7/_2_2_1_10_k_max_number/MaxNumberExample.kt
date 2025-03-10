package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_k_max_number

fun main() {
    val countOfNumbers = readln().toShort()
    val numbers = readln()
        .split(' ')
        .map { it.toInt() }
    println(findMaximumNumber(numbers))
}

private fun findMaximumNumber(
    numbers: List<Int>,
    currentNumbersIndex: Int = 0,
    maximumNumber: Int = Int.MIN_VALUE
): Int {
    if (currentNumbersIndex == numbers.size)
        return maximumNumber
    return findMaximumNumber(
        numbers,
        currentNumbersIndex + 1,
        maxOf(
            maximumNumber,
            numbers[currentNumbersIndex]
        )
    )
}