package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_13_total_n_queens

fun main() {
    println(totalNQueens(1))
    println(totalNQueens(2))
    println(totalNQueens(3))
    print(totalNQueens(4))
}

fun totalNQueens(boardSize: Int): Int {
    return solve(
        0,
        boardSize,
        BooleanArray(boardSize),
        BooleanArray(2 * boardSize),
        BooleanArray(2 * boardSize)
    )
}

private fun solve(
    currentRow: Int,
    boardSize: Int,
    occupiedColumns: BooleanArray,
    occupiedMainDiagonals: BooleanArray,
    occupiedAntiDiagonals: BooleanArray
): Int {
    if (currentRow == boardSize)
        return 1
    else {
        var totalSolutions = 0
        for (currentColumn in 0 until boardSize) {
            val mainDiagonalIndex = currentRow - currentColumn + boardSize
            val antiDiagonalIndex = currentRow + currentColumn
            if (
                !occupiedColumns[currentColumn] &&
                !occupiedMainDiagonals[mainDiagonalIndex] &&
                !occupiedAntiDiagonals[antiDiagonalIndex]
            ) {
                occupiedAntiDiagonals[antiDiagonalIndex] = true
                occupiedMainDiagonals[mainDiagonalIndex] = occupiedAntiDiagonals[antiDiagonalIndex]
                occupiedColumns[currentColumn] = occupiedMainDiagonals[mainDiagonalIndex]
                totalSolutions += solve(
                    currentRow + 1,
                    boardSize,
                    occupiedColumns,
                    occupiedMainDiagonals,
                    occupiedAntiDiagonals
                )
                occupiedAntiDiagonals[antiDiagonalIndex] = false
                occupiedMainDiagonals[mainDiagonalIndex] = occupiedAntiDiagonals[antiDiagonalIndex]
                occupiedColumns[currentColumn] = occupiedMainDiagonals[mainDiagonalIndex]
            }
        }
        return totalSolutions
    }
}