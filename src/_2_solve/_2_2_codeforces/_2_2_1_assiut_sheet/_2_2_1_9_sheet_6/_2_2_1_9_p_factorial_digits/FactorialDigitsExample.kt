package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_p_factorial_digits

import kotlin.math.log10

fun main() {
    val targetNumber = readln().toInt()
    val lengthOfFactorialTargetNumberDigits = getLengthOfFactorialTargetNumberDigits(targetNumber)
    print("Number of digits of $targetNumber! is $lengthOfFactorialTargetNumberDigits")
}

private fun getLengthOfFactorialTargetNumberDigits(targetNumber: Int) = if (targetNumber == 1)
    1
else
    (1..targetNumber).sumOf { log10(it.toDouble()) }.toInt() + 1