package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_59_cumulative_addition

fun main() {
    println(getCumulativeAdditionNumbersAndCountOfNumbers(mutableListOf(5, 1, 2, 4, 9, 10, 200)))
    println(getCumulativeAdditionNumbersAndCountOfNumbers(mutableListOf(500, 123, 52, 123, 22)))
    println(getCumulativeAdditionNumbersAndCountOfNumbers(mutableListOf(1, 1, 2, 5, 2, 5, 8)))
    print(getCumulativeAdditionNumbersAndCountOfNumbers(mutableListOf(7, 9, 12, 100, 244)))
}

private fun getCumulativeAdditionNumbersAndCountOfNumbers(numbers: MutableList<Int>) = mutableListOf(numbers.sum(), numbers.size)