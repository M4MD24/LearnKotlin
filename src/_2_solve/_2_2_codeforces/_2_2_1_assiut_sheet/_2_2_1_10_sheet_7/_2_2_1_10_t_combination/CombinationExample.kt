package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_t_combination

fun main() {
    val (
        totalNumbers,
        targetNumber
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    print(
        getCombination(
            totalNumbers,
            targetNumber
        )
    )
}

private fun getCombination(
    totalNumbers: Byte,
    targetNumber: Byte
): Int {
    if (
        targetNumber == 0.toByte() ||
        targetNumber == totalNumbers
    )
        return 1
    return getCombination(
        (totalNumbers - 1).toByte(),
        (targetNumber - 1).toByte()
    ) + getCombination(
        (totalNumbers - 1).toByte(),
        targetNumber
    )
}