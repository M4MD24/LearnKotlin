package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_14_distribute_donations

fun main() {
    println(
        distributeDonations(
            1000.0,
            mutableListOf(1.0, 2.0, 3.0)
        )
    )

    println(
        distributeDonations(
            500.0,
            mutableListOf(1.0, 1.0, 1.0)
        )
    )

    println(
        distributeDonations(
            250.0,
            mutableListOf(2.0, 3.0)
        )
    )

    print(
        distributeDonations(
            1200.0,
            mutableListOf(1.0, 4.0)
        )
    )
}

private fun distributeDonations(
    totalDonation: Double,
    weights: MutableList<Double>
): MutableList<Double> {
    val totalWeight = weights.sum()
    val allocatedAmounts = weights
        .map { (it / totalWeight) * totalDonation }
        .map { String.format("%.2f", it).toDouble() }
        .toMutableList()
    val roundingAdjustmentValue = totalDonation - allocatedAmounts.sum()
    allocatedAmounts[allocatedAmounts.lastIndex] += roundingAdjustmentValue
    return allocatedAmounts
}