package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_y_range_sum_query

fun main() {
    val (countOfValues, countOfQueries) = readln()
        .split(' ')
        .map { it.toInt() }
    val numbers = readln()
        .split(' ')
        .map { it.toLong() }
    val prefixSums = LongArray(countOfValues + 1)
    for (index in 1..countOfValues)
        prefixSums[index] = prefixSums[index - 1] + numbers[index - 1]
    repeat(countOfQueries) {
        val (leftIndex, rightIndex) = readln()
            .split(' ')
            .map { it.toInt() }
        println(prefixSums[rightIndex] - prefixSums[leftIndex - 1])
    }
}