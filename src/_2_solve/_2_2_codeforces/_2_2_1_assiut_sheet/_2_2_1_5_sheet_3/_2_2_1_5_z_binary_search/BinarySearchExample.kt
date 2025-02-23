package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_z_binary_search

fun main() {
    val (
        countOfValues,
        countOfQueries
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val values = readln()
        .split(' ')
        .map { it.toInt() }
        .sorted()
    repeat(countOfQueries) {
        val targetValue = readln().toInt()
        println(
            if (
                binarySearch(
                    values,
                    targetValue
                )
            )
                "found"
            else
                "not found"
        )
    }
}

private fun binarySearch(
    values: List<Int>,
    targetValue: Int
): Boolean {
    var leftIndex = 0
    var rightIndex = values.size - 1
    while (leftIndex <= rightIndex) {
        val middle = (leftIndex + rightIndex) / 2
        when {
            values[middle] == targetValue -> return true
            values[middle] < targetValue -> leftIndex = middle + 1
            else -> rightIndex = middle - 1
        }
    }
    return false
}