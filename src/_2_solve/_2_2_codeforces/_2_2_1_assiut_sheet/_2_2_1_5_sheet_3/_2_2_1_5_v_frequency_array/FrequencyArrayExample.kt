package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_v_frequency_array

fun main() {
    val (
        countOfValues,
        countOfDistinctValues
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val frequencyValues = IntArray(countOfDistinctValues + 1)
    val values = readln()
        .split(' ')
        .map { it.toInt() }
    values.forEach { frequencyValues[it]++ }
    for (index in 1..countOfDistinctValues)
        println(frequencyValues[index])
}