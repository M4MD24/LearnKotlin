package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_23_sorted_squares

fun sortedSquares(nums: IntArray): List<Int> = nums.map { it * it }.sorted()

fun main() {
    val testCases = listOf(
        intArrayOf(-4, -1, 0, 3, 10),
        intArrayOf(-7, -3, 2, 3, 11),
        intArrayOf(-5, -3, -1, 0, 1, 4, 6),
        intArrayOf(0, 1, 2, 3, 4)
    )
    for (testCase in testCases) {
        println(sortedSquares(testCase))
    }
}