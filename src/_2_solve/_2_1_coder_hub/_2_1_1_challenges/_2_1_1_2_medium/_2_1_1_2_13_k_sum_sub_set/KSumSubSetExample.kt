package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_13_k_sum_sub_set

fun main() {
    println(areThereNumbersEqualTheTargetSum(mutableListOf(7, 3, 2, 5, 8), 14))
    println(areThereNumbersEqualTheTargetSum(mutableListOf(2, 4, 6, 8), 11))
    println(areThereNumbersEqualTheTargetSum(mutableListOf(7, 5, 3, 1), 4))
    print(areThereNumbersEqualTheTargetSum(mutableListOf(14, 8, 12, 9), 21))
}

private fun areThereNumbersEqualTheTargetSum(numbers: MutableList<Int>, targetSum: Int): Boolean {
    val reachableSums = BooleanArray(targetSum + 1)
    reachableSums[0] = true
    for (number in numbers)
        for (index in targetSum downTo number)
            reachableSums[index] = reachableSums[index] || reachableSums[index - number]
    return reachableSums[targetSum]
}