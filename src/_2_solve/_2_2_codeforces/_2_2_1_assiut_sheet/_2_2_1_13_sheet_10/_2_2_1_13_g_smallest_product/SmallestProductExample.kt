package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_g_smallest_product

import kotlin.math.ceil
import kotlin.math.pow

fun main() {
    val countOfNumbers = readln().toInt()
    val numbers = readln()
        .split(' ')
        .map { it.toLong() }
    print(getSmallestProduct(numbers, countOfNumbers))
}

private fun getSmallestProduct(
    numbers: List<Long>,
    countOfNumbers: Int
): Long {
    var accumulator = 1.0
    for (number in numbers)
        accumulator *= number.toDouble().pow(1.0 / countOfNumbers)
    return ceil(accumulator).toLong()
}

/*
fun main() {
    val countOfNumbers = readln().toInt()
    println(10.0.pow(
        readln()
            .split(' ')
            .sumOf { log10(it.toDouble()) } / countOfNumbers).toLong() + 1)
}
*/