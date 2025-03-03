package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_64_get_primes_between

import kotlin.math.sqrt

fun main() = print(getPrimesBetween(readln().toInt(), readln().toInt()))

private fun getPrimesBetween(startNumber: Int, endNumber: Int): MutableList<Int> {
    fun isPrime(number: Int): Boolean {
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

    return (startNumber..endNumber)
        .filter { isPrime(it) }
        .toMutableList()
}