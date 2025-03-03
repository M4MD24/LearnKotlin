package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_8_sheet_5._2_2_1_8_d_prime_function

import kotlin.math.sqrt

fun main() {
    val countOfCases = readln().toShort()
    repeat(countOfCases.toInt()) {
        val number = readln().toInt()
        println(
            if (isPrime(number))
                "YES"
            else
                "NO"
        )
    }
}

private fun isPrime(number: Int): Boolean {
    if (number < 2)
        return false
    if (number == 2 || number == 3)
        return true
    if (number % 2 == 0 || number % 3 == 0)
        return false
    for (index in 5..sqrt(number.toDouble()).toInt() step 2)
        if (number % index == 0)
            return false
    return true
}