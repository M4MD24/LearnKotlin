package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_b_prime_checking

import kotlin.math.sqrt

fun main() {
    val number = readln().toLong()
    print(
        if (isPrime(number))
            "YES"
        else
            "NO"
    )
}

private fun isPrime(number: Long): Boolean {
    if (number < 2)
        return false
    if (number == 2.toLong() || number == 3.toLong())
        return true
    if (number % 2 == 0.toLong() || number % 3 == 0.toLong())
        return false
    for (index in 5..sqrt(number.toDouble()).toInt() step 2)
        if (number % index == 0.toLong())
            return false
    return true
}