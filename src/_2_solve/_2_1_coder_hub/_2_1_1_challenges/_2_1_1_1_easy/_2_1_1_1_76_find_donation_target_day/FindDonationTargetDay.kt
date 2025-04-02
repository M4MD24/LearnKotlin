package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_76_find_donation_target_day

fun main() {
    val testCases = mutableListOf(
        mutableListOf(50.0, 25.0, 30.0, 20.0) to 100.0,
        mutableListOf(10.0, 15.0, 20.0) to 50.0,
        mutableListOf(20.0, 20.0, 20.0, 20.0, 20.0) to 80.0,
        mutableListOf(100.0) to 10.0
    )
    for ((donations, totalDonationLimit) in testCases)
        println(calculateFastingHours(donations, totalDonationLimit))
}

private fun calculateFastingHours(
    donations: MutableList<Double>,
    totalDonationLimit: Double
): Int {
    var currentTotalDonation = 0.0
    for ((fastingHours, donation) in donations.withIndex()) {
        currentTotalDonation += donation
        if (currentTotalDonation >= totalDonationLimit)
            return fastingHours + 1
    }
    return -1
}