package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_k_stars_drawing_easy_edition

fun main() {
    val (
        rows,
        columns
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val grid = Array(rows.toInt()) { readln().toCharArray() }
    val starsList = mutableListOf<Triple<Byte, Byte, Byte>>()
    val coveredCells = Array(rows.toInt()) { BooleanArray(columns.toInt()) }

    for (row in 1..<rows - 1)
        for (col in 1..<columns - 1)
            if (grid[row][col] == '*') {
                val starSize = getMaximumStarSize(grid, row, col)
                if (starSize > 0) {
                    starsList.add(
                        Triple(
                            (row + 1).toByte(),
                            (col + 1).toByte(),
                            starSize
                        )
                    )
                    for (index in 0..starSize) {
                        coveredCells[row][col] = true
                        coveredCells[row - index][col] = true
                        coveredCells[row + index][col] = true
                        coveredCells[row][col - index] = true
                        coveredCells[row][col + index] = true
                    }
                }
            }

    for (row in 0..<rows)
        for (column in 0..<columns)
            if (grid[row][column] == '*' && !coveredCells[row][column]) {
                println(-1)
                return
            }

    printStars(starsList)
}

private fun printStars(starsList: MutableList<Triple<Byte, Byte, Byte>>) {
    println(starsList.size)
    for ((centerRow, centerCol, starSize) in starsList)
        println("$centerRow $centerCol $starSize")
}

private fun getMaximumStarSize(
    grid: Array<CharArray>,
    centerRow: Int,
    centerColumn: Int
): Byte {
    var size = 0
    while (centerRow - size >= 0 && centerRow + size < grid.size &&
        centerColumn - size >= 0 && centerColumn + size < grid[0].size &&
        grid[centerRow - size][centerColumn] == '*' &&
        grid[centerRow + size][centerColumn] == '*' &&
        grid[centerRow][centerColumn - size] == '*' &&
        grid[centerRow][centerColumn + size] == '*'
    ) size++
    return (size - 1).toByte()
}