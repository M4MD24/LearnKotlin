package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_6_contest_3_1._2_2_1_6_c_choose_elements

fun main() {
    val (
        countOfValues,
        maximumValuesToSum
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val valuesAfterDescending = readln()
        .split(' ')
        .map { it.toInt() }
        .asSequence()
        .sortedDescending()
    val sumOfMaximumValuesToSum = valuesAfterDescending
        .take(maximumValuesToSum)
        .filter { it > 0 }
        .sumOf { it.toLong() }
    print(sumOfMaximumValuesToSum)
}