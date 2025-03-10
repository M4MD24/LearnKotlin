package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_v_creating_expression1

private val firstLine = readln().split(' ')
private val countOfNumbers = firstLine[0].toByte()
private val requiredSum = firstLine[1].toInt()
private val numbers = readln()
    .split(' ')
    .map { it.toInt() }

fun main() {
    print(
        if (checkCurrentTotalEqualRequiredSum(numbers[0]))
            "YES"
        else
            "NO"
    )
}

private fun checkCurrentTotalEqualRequiredSum(
    currentSum: Int,
    index: Byte = 1
): Boolean {
    if (index == countOfNumbers)
        return currentSum == requiredSum
    return checkCurrentTotalEqualRequiredSum(
        currentSum + numbers[index.toInt()],
        (index + 1).toByte()
    ) || checkCurrentTotalEqualRequiredSum(
        currentSum - numbers[index.toInt()],
        (index + 1).toByte()
    )
}