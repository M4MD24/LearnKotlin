package _2_solve._2_1_coder_hub._2_1_2_competitions._2_1_2_3_leap_25_day_3_general_trip._2_1_2_3_1_easy._2_1_2_3_1_1_generate_pascals_triangle

fun main() = print(generatePascalsTriangle(readln().toInt()))

fun generatePascalsTriangle(rowCount: Int): MutableList<Int> {
    val flattenedResult = mutableListOf<Int>()
    val triangle = mutableListOf<MutableList<Int>>()
    for (rowIndex in 0 until rowCount) {
        val currentRow = MutableList(rowIndex + 1) { 1 }
        for (columnIndex in 1 until rowIndex)
            currentRow[columnIndex] = triangle[rowIndex - 1][columnIndex - 1] +
                    triangle[rowIndex - 1][columnIndex]
        triangle.add(currentRow)
        flattenedResult.addAll(currentRow)
    }
    return flattenedResult
}