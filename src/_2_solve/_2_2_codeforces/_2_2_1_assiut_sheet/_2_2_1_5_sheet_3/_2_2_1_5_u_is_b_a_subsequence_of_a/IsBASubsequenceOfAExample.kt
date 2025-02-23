package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_u_is_b_a_subsequence_of_a

fun main() {
    val (
        countOfFirstPart,
        countOfSecondPart
    ) = readln()
        .split(' ')
        .map { it.toShort() }
    val firstPart = readln()
        .split(' ')
        .map { it.toInt() }
    val secondPart = readln()
        .split(' ')
        .map { it.toInt() }
    var index: Short = 0
    for (number in firstPart)
        if (
            index < countOfSecondPart &&
            number == secondPart[index.toInt()]
        )
            index++
    print(
        if (index == countOfSecondPart)
            "YES"
        else
            "NO"
    )
}