package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_g_summation_from_1_to_target_number

fun main() {
    val targetNumber = readln().toInt()
    val summationFrom1ToTargetNumber: Long = getSummationFrom1ToTargetNumber(targetNumber)
    print(summationFrom1ToTargetNumber)
}

private fun getSummationFrom1ToTargetNumber(targetNumber: Int) = targetNumber.toLong() * (targetNumber + 1) / 2