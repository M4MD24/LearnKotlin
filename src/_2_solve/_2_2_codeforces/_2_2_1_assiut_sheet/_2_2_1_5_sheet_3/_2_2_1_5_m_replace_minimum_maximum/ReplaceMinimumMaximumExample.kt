package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_m_replace_minimum_maximum

fun main() {
    val countOfValues = readln()
    val values = readln()
        .split(' ')
        .map { it.toInt() }
        .toMutableList()
    val minimumValueIndex = values.indexOf(values.minOf { it })
    val maximumValueIndex = values.indexOf(values.maxOf { it })
    values[minimumValueIndex] = values[maximumValueIndex].also { values[maximumValueIndex] = values[minimumValueIndex] }
    print(values.joinToString(" "))
}