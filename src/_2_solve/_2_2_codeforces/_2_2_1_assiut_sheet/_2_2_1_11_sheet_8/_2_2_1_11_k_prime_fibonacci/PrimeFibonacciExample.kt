package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_k_prime_fibonacci

fun main() {
    val countOfNumbers = readln().toInt()
    repeat(countOfNumbers) {
        val currentNumber = readln().toByte()
        println(
            if (isPrimeFibonacci(currentNumber))
                "prime"
            else
                "not prime"
        )
    }
}

private fun isPrimeFibonacci(currentNumber: Byte): Boolean {
    val isPrime: List<Byte> = listOf(0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0)
    return isPrime[currentNumber.toInt()] == 1.toByte()
}