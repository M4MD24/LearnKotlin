package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_z_clean_code

import java.io.BufferedReader
import java.io.InputStreamReader

private val INPUT = BufferedReader(InputStreamReader(System.`in`))
private val TEXT = StringBuilder()

fun main() {
    inputValues()
    println(TEXT)
}

private fun inputValues() {
    var open = true
    while (true) {
        val line = INPUT.readLine() ?: break
        if (line.trim().isNotEmpty())
            open = isOpen(line, open)
    }
}

private fun isOpen(
    line: String,
    open: Boolean
): Boolean {
    var currentOpen = open
    var lineAppended = false
    val lineLength = line.length
    var index = 0
    while (index < lineLength) {
        if (
            line[index] == '/' &&
            index + 1 < lineLength &&
            line[index + 1] == '/' &&
            currentOpen
        )
            break
        else if (
            line[index] == '/' &&
            index + 1 < lineLength &&
            line[index + 1] == '*' &&
            currentOpen
        ) {
            index++
            currentOpen = false
        } else if (
            line[index] == '*' &&
            index + 1 < lineLength &&
            line[index + 1] == '/' &&
            !currentOpen
        ) {
            index++
            currentOpen = true
        } else if (currentOpen) {
            TEXT.append(line[index])
            lineAppended = true
        }
        index++
    }
    if (
        lineAppended &&
        currentOpen
    )
        TEXT.appendLine()
    return currentOpen
}