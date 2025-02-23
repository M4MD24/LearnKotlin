package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_w_shape_3

private const val SYMBOL = '*'
private const val SPACE = ' '

fun main() {
    val countOfLines = readln().toByte()
    var countOfSymbols = 1
    (countOfLines downTo 1).forEach { countOfSpaces ->
        println(SPACE.toString().repeat(countOfSpaces - 1) + SYMBOL.toString().repeat(countOfSymbols))
        countOfSymbols += 2
    }
    (0..<countOfLines).forEach { countOfSpaces ->
        countOfSymbols -= 2
        println(SPACE.toString().repeat(countOfSpaces) + SYMBOL.toString().repeat(countOfSymbols))
    }
}