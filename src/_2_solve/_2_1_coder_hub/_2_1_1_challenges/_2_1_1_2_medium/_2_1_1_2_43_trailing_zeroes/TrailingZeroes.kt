package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_43_trailing_zeroes

fun main() = print(trailingZeroes(readln().toInt()))

private fun trailingZeroes(number: Int): Int {
    var copyOfNumber = number
    var trailingZeros = 0
    while (copyOfNumber > 0) {
        copyOfNumber /= 5
        trailingZeros += copyOfNumber
    }
    return trailingZeros
}