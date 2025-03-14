package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_10_panoramix_s_prediction

fun main() {
    val (
        previousPrime,
        nextNumber
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    print(
        if (nextPrime(previousPrime) == nextNumber)
            "YES"
        else
            "NO"
    )
}

private fun isPrime(number: Byte): Boolean = (2..<number).none { number % it == 0 }

private fun nextPrime(currentPrime: Byte): Byte {
    var candidate = (currentPrime + 1).toByte()
    while (!isPrime(candidate))
        candidate++
    return candidate
}

// >
/*
val primeNumbersFrom2To47 = listOf<Byte>(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47)

fun main() {
    val (
        previousPrime,
        nextNumber
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    print(
        if (primeNumbersFrom2To47.indexOf(previousPrime) + 1 == primeNumbersFrom2To47.indexOf(nextNumber))
            "YES"
        else
            "NO"
    )
}
*/