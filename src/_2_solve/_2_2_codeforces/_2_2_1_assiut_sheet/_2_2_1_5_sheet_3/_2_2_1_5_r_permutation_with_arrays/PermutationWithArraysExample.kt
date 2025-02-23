package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_r_permutation_with_arrays

fun main() {
    val countOfValues = readln().toInt()
    val firstValues = readln()
        .split(' ')
        .map { it.toInt() }
        .sorted()
    val secondValues = readln()
        .split(' ')
        .map { it.toInt() }
        .sorted()
    print(
        if (firstValues == secondValues)
            "yes"
        else
            "no"
    )
}