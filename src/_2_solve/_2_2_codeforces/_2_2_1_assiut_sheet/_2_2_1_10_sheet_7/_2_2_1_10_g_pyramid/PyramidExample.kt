package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_g_pyramid

private const val SPACE: String = " "
private const val SYMBOL: String = "*"

fun main() {
    val countOfLines = readln().toShort()
    printPyramid(countOfLines)
}

private fun printPyramid(
    countOfLines: Short,
    currentLine: Short = 1
) {
    if (currentLine > countOfLines)
        return
    val spacesCount = SPACE.repeat(countOfLines - currentLine)
    val symbolsCount = SYMBOL.repeat(2 * currentLine - 1)
    println(spacesCount + symbolsCount)
    printPyramid(countOfLines, (currentLine + 1).toShort())
}