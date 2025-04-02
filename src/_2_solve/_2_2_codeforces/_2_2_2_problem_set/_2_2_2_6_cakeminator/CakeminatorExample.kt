package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_6_cakeminator

fun main() {
    val (
        rows,
        columns
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val grid = Array(rows.toInt()) { readln().toCharArray() }
    val safeRows = BooleanArray(rows.toInt()) { true }
    val safeColumns = BooleanArray(columns.toInt()) { true }
    for (row in 0..<rows)
        for (column in 0..<columns)
            if (grid[row][column] == 'S') {
                safeRows[row] = false
                safeColumns[column] = false
            }
    val totalRowEats = safeRows.count { it } * columns
    val totalColEats = safeColumns.count { it } *
            rows - safeRows.count { it } *
            safeColumns.count { it }
    print(totalRowEats + totalColEats)
}