package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_37_primes_numbers

import kotlin.math.sqrt

fun main() {
    println(getPrimeNumbers(mutableListOf(2, 5, 8, 12, 25)))
    println(getPrimeNumbers(mutableListOf(27, 23, 5, 9)))
    println(getPrimeNumbers(mutableListOf(7, 24, 10, 2)))
    print(getPrimeNumbers(mutableListOf(3, 80, 25)))
}

private fun getPrimeNumbers(numbers: MutableList<Int>): MutableList<Int> {
    val primeNumbers = mutableListOf<Int>()
    for (index in numbers.indices) {
        val number = numbers[index]
        if (isPrime(number))
            primeNumbers.add(number)
    }
    return primeNumbers
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