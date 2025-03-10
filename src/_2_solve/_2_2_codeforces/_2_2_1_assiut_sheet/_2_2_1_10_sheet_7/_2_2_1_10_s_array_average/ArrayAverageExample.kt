package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_s_array_average

fun main() {
    val countOfNumbers = readln().toByte()
    val numbers = readln()
        .split(' ')
        .map { it.toLong() }
    print("%.6f".format(getAverage(getSummation(numbers), countOfNumbers)))
}

private fun getAverage(
    summation: Long,
    countOfNumbers: Byte
) = summation.toDouble() / countOfNumbers

private fun getSummation(
    numbers: List<Long>,
    currentIndex: Int = numbers.size - 1
): Long = if (currentIndex < 0)
    0
else
    numbers[currentIndex] + getSummation(
        numbers,
        currentIndex - 1
    )