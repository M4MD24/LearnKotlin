package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_4_contest_2._2_2_1_4_c_finding_minimums

fun main() {
    val (countOfValues, countOfSubValues) = readln()
        .split(' ')
        .map { it.toInt() }
    val numbers = readln()
        .split(' ')
        .map { it.toInt() }
        .chunked(countOfSubValues)
        .map { it.minOrNull() ?: 0 }
    print(numbers.joinToString(" "))
}