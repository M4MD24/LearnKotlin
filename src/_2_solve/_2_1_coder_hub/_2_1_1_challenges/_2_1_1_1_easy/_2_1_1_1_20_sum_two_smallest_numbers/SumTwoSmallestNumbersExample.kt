package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_20_sum_two_smallest_numbers

fun main() {
    println(getSumTwoSmallestNumbers(mutableListOf(2, 5, 6, 7, 3)))
    println(getSumTwoSmallestNumbers(mutableListOf(4, 3, 60, 9)))
    println(getSumTwoSmallestNumbers(mutableListOf(50, 1, 1, 4)))
    print(getSumTwoSmallestNumbers(mutableListOf(7, 8, 60, 100)))
}

private fun getSumTwoSmallestNumbers(numbers: MutableList<Int>): Int {
    numbers.sort()
    return numbers[0] + numbers[1]
}