package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_15_t_primes

import kotlin.math.sqrt

fun main() {
    val countOfNumbers = readln().toInt()
    val numbers = readln()
        .split(' ')
        .map { it.toLong() }
    numbers.forEach { number ->
        println(
            if (isTPrime(number))
                "YES"
            else
                "NO"
        )
    }
}

private fun isTPrime(number: Long): Boolean {
    val squareRootOfNumber = sqrt(number.toDouble()).toLong()
    return squareRootOfNumber * squareRootOfNumber == number &&
            isPrime(squareRootOfNumber)
}

private fun isPrime(number: Long): Boolean {
    if (number < 2)
        return false
    if (number == 2L || number == 3L)
        return true
    if (number % 2 == 0L || number % 3 == 0L)
        return false
    var index = 5L
    while (index * index <= number) {
        if (
            number % index == 0L ||
            number % (index + 2) == 0L
        )
            return false
        index += 6
    }
    return true
}
