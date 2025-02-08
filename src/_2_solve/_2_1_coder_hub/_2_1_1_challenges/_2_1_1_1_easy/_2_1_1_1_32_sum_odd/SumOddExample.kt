package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_32_sum_odd

fun main() {
    println(sumOdd(mutableListOf(2, 9, 5, 4, 0)))
    println(sumOdd(mutableListOf(3, 12, 6)))
    println(sumOdd(mutableListOf(1, 8, 5, 44)))
    print(sumOdd(mutableListOf(1, 7, 1)))
}

private fun sumOdd(numbers: MutableList<Int>) = numbers
    .filter { number -> number % 2 != 0 }
    .sum()