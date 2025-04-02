package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_o_help_koko

import kotlin.math.sqrt

fun main() {
    val firstLine = readln()
        .split(' ')
    val countOfNumbers = firstLine[0].toInt()
    val exponent = firstLine[1].toShort()
    val numbers = readln()
        .split(' ')
        .map { it.toInt() }
    val operations = readln()
        .split(' ')
        .map { it.toByte() }
    for (index in 0..<countOfNumbers) {
        val currentOperation = operations[index]
        val currentNumber = numbers[index]
        print(
            if (currentOperation == 1.toByte()) {
                if (isPrime(currentNumber))
                    if (currentNumber % 2 == 0)
                        "0 "
                    else
                        "5 "
                else
                    "-1 "
            } else
                "0 "
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