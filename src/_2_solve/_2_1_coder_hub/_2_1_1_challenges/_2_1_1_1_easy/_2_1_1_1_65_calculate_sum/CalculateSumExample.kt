package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_65_calculate_sum

fun main() {
    println(getCumulativeAdditionNumbersAndCountOfNumbers(mutableListOf(1, 2, 3, 4)))
    println(getCumulativeAdditionNumbersAndCountOfNumbers(mutableListOf(0, 7, 12, 67)))
    println(getCumulativeAdditionNumbersAndCountOfNumbers(mutableListOf(23, 43, 27, 87, 67)))
    print(getCumulativeAdditionNumbersAndCountOfNumbers(mutableListOf(84, 469)))
}

private fun getCumulativeAdditionNumbersAndCountOfNumbers(numbers: MutableList<Int>) = if (numbers.contains(7))
    0
else
    numbers.sum()