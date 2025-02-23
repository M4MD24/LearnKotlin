package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_z_three_numbers

fun main() {
    val (
        maximumValue,
        targetSum
    ) = readln()
        .split(' ')
        .map { it.toShort() }
    print(
        countValidTriplets(
            maximumValue,
            targetSum
        )
    )
}

private fun countValidTriplets(
    maximumValue: Short,
    targetSum: Short
): Int {
    var count = 0
    for (firstNumber in 0..maximumValue)
        for (secondNumber in 0..maximumValue) {
            val thirdNumber = targetSum - firstNumber - secondNumber
            if (thirdNumber in 0..maximumValue)
                count++
        }
    return count
}