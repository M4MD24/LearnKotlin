package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_8_sheet_5._2_2_1_8_o_five_in_one

import kotlin.math.sqrt

private var maximumNumber: Byte = 1
private var minimumNumber: Byte = 100
private var primeNumbers: Byte = 0
private var palindromeNumbers: Byte = 0
private var maximumNumberOfDivisors: Byte = 1
private var countOfDivisors: Byte = 1

fun main() {
    inputValues()
    printValues()
}

private fun printValues() {
    System.out.printf(
        """
                        The maximum number : %d
                        The minimum number : %d
                        The number of prime numbers : %d
                        The number of palindrome numbers : %d
                        The number that has the maximum number of divisors : %d
                        """.trimIndent(),
        maximumNumber,
        minimumNumber,
        primeNumbers,
        palindromeNumbers,
        maximumNumberOfDivisors
    )
}

private fun inputValues() {
    val countOfNumbers = readln().toByte()
    val numbers = readln()
        .split(' ')
        .map { it.toByte() }
    for (index in 0..<countOfNumbers) {
        val currentNumber = numbers[index]
        if (currentNumber > maximumNumber)
            maximumNumber = currentNumber
        if (currentNumber < minimumNumber)
            minimumNumber = currentNumber
        if (isPrime(currentNumber))
            primeNumbers++
        if (isPalindrome(currentNumber))
            palindromeNumbers++
        calculateMaximumCountDivisors(currentNumber)
    }
}

private fun calculateMaximumCountDivisors(currentNumber: Byte) {
    val currentCountOfDivisors = countDivisors(currentNumber)
    if (
        currentCountOfDivisors > countOfDivisors ||
        (
                currentCountOfDivisors == countOfDivisors &&
                        currentNumber > maximumNumberOfDivisors
                )
    ) setMaximumCountOfDivisors(
        currentNumber,
        currentCountOfDivisors
    )
}

private fun setMaximumCountOfDivisors(
    currentNumber: Byte,
    currentCountOfDivisors: Byte
) {
    maximumNumberOfDivisors = currentNumber
    countOfDivisors = currentCountOfDivisors
}

private fun countDivisors(currentNumber: Byte): Byte {
    var countOfDivisors: Byte = 2
    for (index in 2..<currentNumber)
        if (currentNumber % index == 0)
            countOfDivisors++
    return countOfDivisors
}

private fun isPalindrome(currentNumber: Byte) = if (currentNumber < 10)
    true
else if (currentNumber < 100)
    currentNumber % 10 == currentNumber / 10
else
    currentNumber % 10 == currentNumber / 100

private fun isPrime(number: Byte): Boolean {
    if (number < 2)
        return false
    if (number == 2.toByte() || number == 3.toByte())
        return true
    if (number % 2 == 0 || number % 3 == 0)
        return false
    for (index in 5..sqrt(number.toDouble()).toInt() step 2)
        if (number % index == 0)
            return false
    return true
}