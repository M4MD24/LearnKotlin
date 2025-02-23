package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_l_maximum_subarray

fun main() {
    val countOfCases = readln().toByte()
    repeat(countOfCases.toInt()) {
        val countOfValues = readln().toInt()
        val values = readln()
            .split(' ')
            .map { it.toInt() }
        for (startIndex in values.indices) {
            var maximumValue = values[startIndex]
            for (endIndex in startIndex..<countOfValues) {
                val currentValue = values[endIndex]
                maximumValue = maxOf(maximumValue, currentValue)
                print("$maximumValue ")
            }
        }
        println()
    }
}