package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_x_8_neighbors

fun main() {
    val (
        rows,
        columns
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val matrixValues = Array(rows) { readln() }
    val (
        targetRow,
        targetColumn
    ) = readln()
        .split(' ')
        .map { it.toInt() - 1 }
    val directions = listOf(
        -1 to -1,
        -1 to 0,
        -1 to 1,
        0 to -1,
        0 to 1,
        1 to -1,
        1 to 0,
        1 to 1
    )
    print(
        if (
            directions.all { (directionRow, directionColumn) ->
                val neighborRow = targetRow + directionRow
                val neighborColumn = targetColumn + directionColumn
                neighborRow !in 0..<rows ||
                        neighborColumn !in 0..<columns ||
                        matrixValues[neighborRow][neighborColumn] == 'x'
            }
        )
            "yes"
        else
            "no"
    )
}