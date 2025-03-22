package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_48_calculate_donation_percentages

fun main() {
    println(
        calculateDonationPercentages(
            mutableListOf("فاطمة", "علي"),
            mutableListOf(100.0, 100.0)
        )
    )
    println(
        calculateDonationPercentages(
            mutableListOf("فاطمة", "علي", "خالد"),
            mutableListOf(50.0, 25.0, 25.0)
        )
    )
    println(
        calculateDonationPercentages(
            mutableListOf("سامي", "محمود", "يوسف"),
            mutableListOf(30.0, 30.0, 40.0)
        )
    )
    print(
        calculateDonationPercentages(
            mutableListOf("زيد"),
            mutableListOf(1000.0)
        )
    )
}

private fun calculateDonationPercentages(
    names: MutableList<String>,
    donations: MutableList<Double>
): MutableList<String> {
    val total = donations.sum()
    return names.mapIndexed { index, name ->
        "$name: ${(donations[index] / total * 100)}%"
    }.toMutableList()
}