package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_6_contest_3_1._2_2_1_6_e_alternating_array

fun main() {
    val countOfValues = readln().toInt()
    val values = readln()
        .split(' ')
        .map { it.toByte() }
    print(
        minOf(
            countOperations(
                values,
                true
            ),
            countOperations(
                values,
                false
            )
        )
    )
}

private fun countOperations(
    values: List<Byte>,
    isFirstValuePositive: Boolean
): Int {
    var operations = 0
    var shouldBePositive = isFirstValuePositive
    for (number in values) {
        if (
            shouldBePositive && number < 0 ||
            !shouldBePositive && number > 0
        )
            operations++
        shouldBePositive = !shouldBePositive
    }
    return operations
}