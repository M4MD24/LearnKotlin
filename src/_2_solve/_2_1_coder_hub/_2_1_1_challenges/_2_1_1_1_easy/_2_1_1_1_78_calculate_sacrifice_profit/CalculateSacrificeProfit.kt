package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_78_calculate_sacrifice_profit

fun main() {
    print(calculateSacrificeProfit(mutableListOf(100.0, 200.0), mutableListOf(150.0, 250.0)))
}

private fun calculateSacrificeProfit(
    buyPrices: MutableList<Double>,
    sellPrices: MutableList<Double>
) = sellPrices.zip(buyPrices).sumOf { (sell, buy) -> sell - buy }