package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_u_some_sums

fun main() {
    val (targetNumber, startNumber, endNumber) = readln()
        .split(' ')
        .map { it.toShort() }
    var totalSum = 0
    for (currentNumber in 1..targetNumber)
        if (getSumOfDigits(currentNumber) in startNumber..endNumber)
            totalSum += currentNumber
    print(totalSum)
}

private fun getSumOfDigits(number: Int): Int {
    var sumOfDigits = 0
    var currentNumber = number
    while (currentNumber > 0) {
        sumOfDigits += currentNumber % 10
        currentNumber /= 10
    }
    return sumOfDigits
}