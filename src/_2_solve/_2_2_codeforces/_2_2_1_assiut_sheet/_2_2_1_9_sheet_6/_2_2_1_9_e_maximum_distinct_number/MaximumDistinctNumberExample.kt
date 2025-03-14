package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_e_maximum_distinct_number

import kotlin.math.sqrt

fun main() {
    val targetNumber = readln().toLong()
    print(getMaximumSumFromOneToTargetNumber(targetNumber))
}

private fun getMaximumSumFromOneToTargetNumber(targetNumber: Long) = ((sqrt(1 + 8.0 * targetNumber) - 1) / 2).toLong()