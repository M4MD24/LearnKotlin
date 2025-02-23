package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_q_count_subarrays

fun main() {
    val countOfCases = readln().toByte()
    repeat(countOfCases.toInt()) {
        val countOfValues = readln().toByte()
        val values = readln()
            .split(' ')
            .map { it.toInt() }
        println(countNonDecreasingSubArrays(values))
    }
}

private fun countNonDecreasingSubArrays(values: List<Int>): Int {
    var count = 0
    var length = 1
    for (index in 1..<values.size)
        if (values[index] >= values[index - 1])
            length++
        else {
            count += length * (length + 1) / 2
            length = 1
        }
    count += length * (length + 1) / 2
    return count
}