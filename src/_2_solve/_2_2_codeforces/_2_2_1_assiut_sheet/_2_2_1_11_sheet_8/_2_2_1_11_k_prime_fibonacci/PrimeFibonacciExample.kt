package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_k_prime_fibonacci

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private val INPUT = BufferedReader(InputStreamReader(System.`in`))
private val OUTPUT = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    inputValues()
    OUTPUT.flush()
}

private fun inputValues() {
    var countOfTestCases = INPUT.readLine().toInt()
    while (countOfTestCases-- > 0)
        OUTPUT.write(
            (
                    if (isPrime(INPUT.readLine().toByte()))
                        "prime"
                    else
                        "not prime"
                    ) +
                    "\n"
        )
}

private fun isPrime(number: Byte): Boolean {
    val isPrime = byteArrayOf(0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0)
    return isPrime[number.toInt()].toInt() == 1
}