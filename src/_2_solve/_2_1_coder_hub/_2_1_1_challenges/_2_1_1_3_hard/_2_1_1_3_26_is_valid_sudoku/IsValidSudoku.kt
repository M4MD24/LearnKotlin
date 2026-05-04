package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_26_is_valid_sudoku

fun isValidSudoku(board: MutableList<String>): Boolean {
    val rows = Array(9) { mutableSetOf<Char>() }
    val cols = Array(9) { mutableSetOf<Char>() }
    val boxes = Array(9) { mutableSetOf<Char>() }
    for (row in 0 until 9) {
        for (col in 0 until 9) {
            val cell = board[row][col]
            if (cell == '.') continue
            val boxIndex = (row / 3) * 3 + (col / 3)
            if (cell in rows[row] || cell in cols[col] || cell in boxes[boxIndex]) return false
            rows[row].add(cell)
            cols[col].add(cell)
            boxes[boxIndex].add(cell)
        }
    }
    return true
}

fun main() {
    val testCases = listOf(
        listOf("53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"),
        listOf("83..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"),
        listOf("..3..7...", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"),
        listOf("55.......", ".........", ".........", ".........", ".........", ".........", ".........", ".........", ".........")
    )
    for (testCase in testCases)
        println(isValidSudoku(testCase.toMutableList()))
}