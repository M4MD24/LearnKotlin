package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_x_the_maximum_path_sum

fun main() {
    val (
        rows,
        columns
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val matrix = Array(rows) {
        readln()
            .split(' ')
            .map { it.toInt() }
            .toIntArray()
    }

    println(
        maximumPathSum(
            matrix,
            rows,
            columns
        )
    )
}

private fun maximumPathSum(
    matrix: Array<IntArray>,
    rows: Int,
    columns: Int,
    currentRow: Int = 0,
    currentColumn: Int = 0
): Int {
    if (
        currentRow == rows - 1 &&
        currentColumn == columns - 1
    )
        return matrix[currentRow][currentColumn]
    if (
        currentRow >= rows ||
        currentColumn >= columns
    )
        return Int.MIN_VALUE
    val rightPath = maximumPathSum(
        matrix,
        rows,
        columns,
        currentRow,
        currentColumn + 1
    )
    val downPath = maximumPathSum(
        matrix,
        rows,
        columns,
        currentRow + 1,
        currentColumn
    )
    return matrix[currentRow][currentColumn] + maxOf(
        rightPath,
        downPath
    )
}