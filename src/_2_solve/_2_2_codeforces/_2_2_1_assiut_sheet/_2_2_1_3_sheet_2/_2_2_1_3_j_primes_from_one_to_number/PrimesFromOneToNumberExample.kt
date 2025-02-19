package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_j_primes_from_one_to_number

fun main() {
    val targetNumber = readln().toShort()
    print(
        (2..targetNumber)
            .filter { isPrime(it) }
            .joinToString(" ")
    )
}

private fun isPrime(number: Int): Boolean {
    if (number < 2)
        return false
    if (number == 2 || number == 3)
        return true
    if (number % 2 == 0 || number % 3 == 0)
        return false
    var index = 5
    while (index * index <= number) {
        if (
            number % index == 0 ||
            number % (index + 2) == 0
        ) return false
        index += 6
    }
    return true
}