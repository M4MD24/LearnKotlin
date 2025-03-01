package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_46_calculate_total_price

fun main() {
    println(
        calculateTotalPrice(
            mutableListOf(100.0, 200.0, 50.0),
            0.1
        )
    )
    println(
        calculateTotalPrice(
            mutableListOf(10.0, 20.0, 30.0),
            0.2
        )
    )
    println(
        calculateTotalPrice(
            mutableListOf(500.0, 1500.0),
            0.15
        )
    )
    print(
        calculateTotalPrice(
            mutableListOf(50.0, 75.0, 100.0),
            0.08
        )
    )
}

private fun calculateTotalPrice(
    prices: MutableList<Double>,
    taxRate: Double
) = prices.sum() * (1 + taxRate)