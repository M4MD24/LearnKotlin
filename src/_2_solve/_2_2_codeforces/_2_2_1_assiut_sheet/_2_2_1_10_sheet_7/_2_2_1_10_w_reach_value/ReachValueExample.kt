package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_w_reach_value

fun main() {
    val countOfCases = readln().toByte()
    repeat(countOfCases.toInt()) {
        val targetNumber = readln().toLong()
        println(
            if (canNumber1ReachToTargetNumber(targetNumber))
                "YES"
            else
                "NO"
        )
    }
}

private fun canNumber1ReachToTargetNumber(
    targetNumber: Long,
    currentNumber: Long = 1
): Boolean {
    if (currentNumber > targetNumber)
        return false
    if (currentNumber == targetNumber)
        return true
    return canNumber1ReachToTargetNumber(
        targetNumber,
        currentNumber * 10
    ) || canNumber1ReachToTargetNumber(
        targetNumber,
        currentNumber * 20
    )
}