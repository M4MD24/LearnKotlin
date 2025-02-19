package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_20_cumulative_sum

fun main() {
    println(geCumulativeSum(mutableListOf(2, 4, 8)))
    println(geCumulativeSum(mutableListOf(0, 0, 0)))
    println(geCumulativeSum(mutableListOf(3, 4, 5)))
    print(geCumulativeSum(mutableListOf(-4, -3, -2)))
}

private fun geCumulativeSum(numbers: MutableList<Int>): MutableList<Int> {
    fun helper(index: Int) {
        if (index == 0)
            return
        helper(index - 1)
        numbers[index] += numbers[index - 1]
    }
    helper(numbers.size - 1)
    return numbers
}

// >
/*
private fun geCumulativeSum(numbers: MutableList<Int>): MutableList<Int> {
    var currentSum = numbers[0]
    for (index in 1 until numbers.size) {
        val currentNumber = numbers[index]
        numbers[index] += currentSum
        currentSum += currentNumber
    }
    return numbers
}
*/