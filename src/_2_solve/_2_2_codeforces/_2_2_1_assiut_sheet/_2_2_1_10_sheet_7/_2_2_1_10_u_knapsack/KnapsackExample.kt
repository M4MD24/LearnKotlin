package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_u_knapsack

fun main() {
    val (
        numberOfWeights,
        countOfValues
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val weights = IntArray(numberOfWeights)
    val values = IntArray(numberOfWeights)

    repeat(numberOfWeights) { index ->
        val (currentWeight, currentValue) = readln()
            .split(' ')
            .map { it.toInt() }
        weights[index] = currentWeight
        values[index] = currentValue
    }
    print(
        getKnapsackWeight(
            numberOfWeights,
            countOfValues,
            weights,
            values
        )
    )
}

private fun getKnapsackWeight(
    index: Int,
    remainingWeight: Int,
    weights: IntArray,
    values: IntArray
): Int {
    if (
        index == 0 ||
        remainingWeight == 0
    )
        return 0
    if (weights[index - 1] > remainingWeight)
        return getKnapsackWeight(
            index - 1,
            remainingWeight,
            weights,
            values
        )
    val includeItem = values[index - 1] + getKnapsackWeight(
        index - 1,
        remainingWeight - weights[index - 1],
        weights,
        values
    )
    val excludeItem = getKnapsackWeight(
        index - 1,
        remainingWeight,
        weights,
        values
    )
    return maxOf(
        includeItem,
        excludeItem
    )
}