package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_g_summation_of_its_divisors

import kotlin.math.sqrt

fun main() {
    val number = readln().toLong()
    println(getSumDivisors(number))
}

private fun getSumDivisors(targetNumber: Long): Long {
    var sumDivisors = 0L
    val sqrtNumber = sqrt(targetNumber.toDouble()).toLong()
    for (divisor in 1..sqrtNumber)
        if (targetNumber % divisor == 0L) {
            sumDivisors += divisor
            val pairedDivisor = targetNumber / divisor
            if (pairedDivisor != divisor)
                sumDivisors += pairedDivisor
        }
    return sumDivisors
}