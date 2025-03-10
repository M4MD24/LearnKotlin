package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_48_calculate_empowerment_index

fun main() {
    println(
        calculateEmpowermentIndex(
            mutableListOf(8.0, 7.0, 9.0),
            mutableListOf(1.0, 1.0, 1.0)
        )
    )
    println(
        calculateEmpowermentIndex(
            mutableListOf(10.0, 10.0, 10.0),
            mutableListOf(1.0, 1.0, 1.0)
        )
    )
    println(
        calculateEmpowermentIndex(
            mutableListOf(5.0, 6.0, 7.0),
            mutableListOf(2.0, 3.0, 5.0)
        )
    )
    print(
        calculateEmpowermentIndex(
            mutableListOf(0.0, 10.0),
            mutableListOf(1.0, 1.0)
        )
    )
}

private fun calculateEmpowermentIndex(
    achievements: MutableList<Double>,
    weights: MutableList<Double>
): Double {
    val weightedSum = achievements
        .zip(weights)
        .sumOf { (currentAchievements, currentWeight) ->
            currentAchievements * currentWeight
        }
    val totalWeight = weights.sum()
    return weightedSum / totalWeight
}