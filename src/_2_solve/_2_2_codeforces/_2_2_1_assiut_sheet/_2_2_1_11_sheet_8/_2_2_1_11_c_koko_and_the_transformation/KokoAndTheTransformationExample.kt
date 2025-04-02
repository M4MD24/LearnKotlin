package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_c_koko_and_the_transformation

fun main() {
    val (
        countOfFirstNumbers,
        countOfSecondNumbers
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val firstNumbers = getNumbers()
    val secondNumbers = getNumbers()
    print(
        if (firstNumbers.sum() == secondNumbers.sum())
            "Yes"
        else
            "No"
    )
}

private fun getNumbers() = readln()
    .split(' ')
    .map { it.toShort() }