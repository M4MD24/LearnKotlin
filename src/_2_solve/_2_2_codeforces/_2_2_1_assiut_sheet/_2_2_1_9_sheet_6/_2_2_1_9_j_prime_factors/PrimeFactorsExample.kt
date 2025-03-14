package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_j_prime_factors

fun main() {
    var remaining = readln().toInt()
    val primeFactors = mutableMapOf<Int, Int>()

    var exponent = 0
    while (remaining % 2 == 0) {
        remaining /= 2
        exponent++
    }

    if (exponent > 0)
        primeFactors[2] = exponent

    var divisor = 3
    while (divisor * divisor <= remaining) {
        exponent = 0
        while (remaining % divisor == 0) {
            remaining /= divisor
            exponent++
        }
        if (exponent > 0)
            primeFactors[divisor] = exponent
        divisor += 2
    }

    if (remaining > 1)
        primeFactors[remaining] = 1

    print(primeFactors.entries.joinToString("*") { "(${it.key}^${it.value})" })
}