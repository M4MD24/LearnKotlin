package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_31_largest_smallest

fun main() {
    println(getLargestAndSmallestNumber(mutableListOf(5, 1, 2, 4, 9, 10, 200)))
    println(getLargestAndSmallestNumber(mutableListOf(500, 123, 52, 123, 22)))
    println(getLargestAndSmallestNumber(mutableListOf(1, 1, 2, 5, 2, 5, 8)))
    print(getLargestAndSmallestNumber(mutableListOf(7, 9, 12, 100, 244)))
}

private fun getLargestAndSmallestNumber(numbers: MutableList<Int>) = mutableListOf(
    numbers.maxOf { it },
    numbers.minOf { it }
)