package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_y_spiral

fun main() {
    val (
        rows, columns
    ) = readln()
        .split(' ')
        .map { it.toShort() }
    val matrixNumbers = Array(rows.toInt()) {
        readln()
            .split(' ')
            .map { it.toLong() }
    }

    var (
        topIndex,
        bottomIndex,
        leftIndex,
        rightIndex
    ) = listOf(
        0,
        rows - 1,
        0,
        columns - 1
    )
    val numbers = mutableListOf<Long>()

    while (
        topIndex <= bottomIndex &&
        leftIndex <= rightIndex
    ) {
        (leftIndex..rightIndex).forEach { numbers += matrixNumbers[topIndex][it] }
        topIndex++
        (topIndex..bottomIndex).forEach { numbers += matrixNumbers[it][rightIndex] }
        rightIndex--
        if (topIndex <= bottomIndex)
            (rightIndex downTo leftIndex).forEach { numbers += matrixNumbers[bottomIndex][it] }
        bottomIndex--
        if (leftIndex <= rightIndex)
            (bottomIndex downTo topIndex).forEach { numbers += matrixNumbers[it][leftIndex] }
        leftIndex++
    }

    print(numbers.joinToString(" "))
}