package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_n_pumbaa_and_apples

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

private val INPUT = BufferedReader(InputStreamReader(System.`in`))
private val OUTPUT = BufferedWriter(OutputStreamWriter(System.out))
private var line: StringTokenizer? = null
private var rows: Short = 0
private var columns: Short = 0
private var countOfOperations = 0
private var farm: Array<IntArray>? = null

fun main() {
    inputApplesNumbers()
    printFinalResultOfApplesArrangement()
}

private fun printFinalResultOfApplesArrangement() {
    val applesRow = ShortArray(rows.toInt())
    val applesColumn = ShortArray(columns.toInt())
    initializeApplesNumbersForRowsAndColumn(applesRow, applesColumn)
    for (index in 0..<countOfOperations) {
        line = StringTokenizer(INPUT.readLine())
        val operationCharacter = line!!.nextToken()[0]
        val firstIndex = (line!!.nextToken().toShort() - 1).toShort()
        val secondIndex = (line!!.nextToken().toShort() - 1).toShort()
        when (operationCharacter) {
            'c' -> swap(applesColumn, firstIndex, secondIndex)
            'r' -> swap(applesRow, firstIndex, secondIndex)
            else -> {
                OUTPUT.write(farm!![applesRow[firstIndex.toInt()].toInt()][applesColumn[secondIndex.toInt()].toInt()].toString())
                OUTPUT.newLine()
            }
        }
    }
    OUTPUT.flush()
}

private fun initializeApplesNumbersForRowsAndColumn(
    applesRow: ShortArray,
    applesColumn: ShortArray
) {
    for (row in 0..<rows)
        applesRow[row] = row.toShort()
    for (column in 0..<columns)
        applesColumn[column] = column.toShort()
}

private fun inputApplesNumbers() {
    line = StringTokenizer(INPUT.readLine())
    rows = line!!.nextToken().toShort()
    columns = line!!.nextToken().toShort()
    countOfOperations = line!!.nextToken().toInt()
    farm = Array(rows.toInt()) { IntArray(columns.toInt()) }
    for (row in 0..<rows) {
        line = StringTokenizer(INPUT.readLine())
        for (column in 0..<columns)
            farm!![row][column] = line!!.nextToken().toInt()
    }
}

private fun swap(
    apples: ShortArray,
    firstIndex: Short,
    secondIndex: Short
) {
    apples[firstIndex.toInt()] = (apples[firstIndex.toInt()] + apples[secondIndex.toInt()]).toShort()
    apples[secondIndex.toInt()] = (apples[firstIndex.toInt()] - apples[secondIndex.toInt()]).toShort()
    apples[firstIndex.toInt()] = (apples[firstIndex.toInt()] - apples[secondIndex.toInt()]).toShort()
}