package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_z_left_max

fun main() {
    val countOfNumbers = readln().toInt()
    val numbers = readln()
        .split(' ')
        .map { it.toInt() }
    printMaximumInRangesFromOneToIndex(numbers)
}

private fun printMaximumInRangesFromOneToIndex(
    numbers: List<Int>,
    position: Int = 0,
    currentMaximum: Int = numbers[position]
) {
    if (position == numbers.size)
        return
    val updatedMaximum = maxOf(
        currentMaximum,
        numbers[position]
    )
    print("$updatedMaximum ")
    printMaximumInRangesFromOneToIndex(
        numbers,
        position + 1,
        updatedMaximum
    )
}