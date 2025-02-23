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

fun binarySearch(
    values: List<Int>,
    targetValue: Int
): Boolean {
    var left = 0
    var right = values.size - 1
    while (left <= right) {
        val middle = (left + right) / 2
        when {
            values[middle] == targetValue -> return true
            values[middle] < targetValue -> left = middle + 1
            else -> right = middle - 1
        }
    }
    return false
}