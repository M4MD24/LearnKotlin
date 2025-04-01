package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_c_koko_and_the_transformation

fun main() {
    val (
        countOfFirstNumbers,
        countOfSecondNumbers
    ) = readln()
        .split(' ')
        .map { it.toInt() }

    val firstNumbers = readln()
        .split(' ')
        .map { it.toShort() }
    val secondNumbers = readln()
        .split(' ')
        .map { it.toShort() }

    print(
        if (firstNumbers.sum() == secondNumbers.sum())
            "Yes"
        else
            "No"
    )
}