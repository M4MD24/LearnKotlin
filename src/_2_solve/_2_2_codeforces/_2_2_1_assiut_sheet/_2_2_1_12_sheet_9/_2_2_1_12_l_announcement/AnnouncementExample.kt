package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_l_announcement

fun main() {
    val countOfLevels = readln().toShort()
    val levels = readln()
        .split(' ')
        .map { it.toInt() }
    val frequency = levels
        .groupingBy { it }
        .eachCount()
        .values
    val duplicates = frequency.sumOf { it - 1 }
    print(
        if (duplicates > 0)
            duplicates
        else
            -1
    )
}