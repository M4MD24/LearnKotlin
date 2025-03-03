package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_8_sheet_5._2_2_1_8_n_shift_zeros

fun main() {
    val countOfNumbers = readln().toShort()
    val numbers = readln()
        .split(' ')
        .map { it.toShort() }
    printShiftZeros(numbers)
}

private fun printShiftZeros(numbers: List<Short>) {
    val nonZeroElements = numbers.filter { it != 0.toShort() }
    val zeroCount = numbers.size - nonZeroElements.size
    print((nonZeroElements + List(zeroCount) { 0 }).joinToString(" "))
}