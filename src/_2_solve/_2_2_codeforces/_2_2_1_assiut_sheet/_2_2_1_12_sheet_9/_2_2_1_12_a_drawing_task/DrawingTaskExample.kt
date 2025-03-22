package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_a_drawing_task

import java.util.Scanner

private val INPUT: Scanner = Scanner(System.`in`)
private val ROWS: Byte = INPUT.nextByte()
private val COLUMNS: Byte = INPUT.nextByte()
private var countOfLines: Byte = INPUT.nextByte()
private val MATRIX: Array<CharArray> = Array(ROWS.toInt()) { CharArray(COLUMNS.toInt()) { '.' } }

fun main() {
    inputValues()
    draw()
}

private fun draw() {
    for (row in 0..<ROWS) {
        for (column in 0..<COLUMNS) print(MATRIX[row][column])
        if (row < ROWS - 1) println()
    }
}

private fun inputValues() {
    while (countOfLines-- > 0) {
        var startRow: Byte = (INPUT.nextByte() - 1).toByte()
        var startColumn: Byte = (INPUT.nextByte() - 1).toByte()
        var endRow: Byte = (INPUT.nextByte() - 1).toByte()
        var endColumn: Byte = (INPUT.nextByte() - 1).toByte()
        if (startRow > endRow) {
            startRow = (startRow + endRow).toByte()
            endRow = (startRow - endRow).toByte()
            startRow = (startRow - endRow).toByte()
        }
        if (startColumn > endColumn) {
            startColumn = (startColumn + endColumn).toByte()
            endColumn = (startColumn - endColumn).toByte()
            startColumn = (startColumn - endColumn).toByte()
        }
        drawInMatrix(startRow, startColumn, endRow, endColumn, INPUT.next().get(0))
    }
}

private fun drawInMatrix(startRow: Byte, startColumn: Byte, END_ROW: Byte, END_COLUMN: Byte, CHARACTER: Char) {
    for (row in startRow..END_ROW) for (column in startColumn..END_COLUMN) MATRIX[row][column] = CHARACTER
}