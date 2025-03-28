package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_s_dzy_loves_chessboard

fun main() {
    val (
        rows,
        columns
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val chessboard = Array(rows.toInt()) { readln().toCharArray() }
    for (row in 0..<rows)
        for (column in 0..<columns)
            if (chessboard[row][column] == '.')
                chessboard[row][column] = if ((row + column) % 2 == 0)
                    'B'
                else
                    'W'
    print(chessboard.joinToString("\n") { "$it" })
}