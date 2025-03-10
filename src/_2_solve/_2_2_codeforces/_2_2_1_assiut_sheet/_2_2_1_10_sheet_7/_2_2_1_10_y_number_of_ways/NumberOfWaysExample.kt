package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_y_number_of_ways

fun main() {
    val (
        start,
        end
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    println(countWays(start, end))
}

private fun countWays(
    start: Byte,
    end: Byte
): Int {
    if (start == end) return 1
    if (start > end) return 0
    return countWays((start + 1).toByte(), end) +
            countWays((start + 2).toByte(), end) +
            countWays((start + 3).toByte(), end)
}