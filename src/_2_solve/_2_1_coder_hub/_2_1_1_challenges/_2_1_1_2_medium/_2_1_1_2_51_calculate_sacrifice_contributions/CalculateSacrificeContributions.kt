package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_51_calculate_sacrifice_contributions

fun main() {
    print(calculateSacrificeContributions(mutableListOf("عمر", "منى", "علي"), mutableListOf(0.4, 0.4, 0.2), 500.0))
}

private fun calculateSacrificeContributions(
    names : MutableList<String>,
    shares : MutableList<Double>,
    totalCost : Double
) = shares.map { it * totalCost }.toMutableList()