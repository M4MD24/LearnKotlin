package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_15_find_donation_target_day

fun main() {
    val testCases = mutableListOf(
        mutableListOf(50.0, 25.0, 30.0, 20.0) to 100.0,
        mutableListOf(10.0, 15.0, 20.0) to 50.0,
        mutableListOf(20.0, 30.0, 50.0) to 80.0,
        mutableListOf(0.0, 0.0, 0.0) to 10.0
    )
    for ((donations, target) in testCases)
        println(findDonationTargetDay(donations, target))
}

private fun findDonationTargetDay(
    donations: MutableList<Double>,
    targetDonationsSum: Double
): Int {
    var donationsSum = 0.0
    for (index in donations.indices) {
        donationsSum += donations[index]
        if (donationsSum >= targetDonationsSum)
            return index + 1
    }
    return -1
}