package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_t_matrix

import kotlin.math.abs

fun main() {
    val rowsAndColumns = readln().toByte()
    var primarySum = 0
    var secondarySum = 0
    repeat(rowsAndColumns.toInt()) { rowIndex ->
        val rowValues = readln()
            .split(' ')
            .map { it.toByte() }
        primarySum += rowValues[rowIndex]
        secondarySum += rowValues[rowsAndColumns - rowIndex - 1]
    }
    print(abs(primarySum - secondarySum))
}