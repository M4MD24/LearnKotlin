package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_44_max_profit

fun main() {
    println(maxProfit(mutableListOf(3, 3, 5, 0, 0, 3, 1, 4)))
    println(maxProfit(mutableListOf(1, 2, 3, 4, 5)))
    println(maxProfit(mutableListOf(1, 4, 2, 5)))
    println(maxProfit(mutableListOf(1, 2, 3, 4, 5)))
}

private fun maxProfit(prices: MutableList<Int>): Int {
    var firstBuy = prices[0]
    var firstProfit = 0
    var secondBuy = prices[0]
    var maxTotalProfit = 0
    for (index in 1 until prices.size) {
        val price = prices[index]
        firstBuy = minOf(firstBuy, price)
        firstProfit = maxOf(firstProfit, price - firstBuy)
        secondBuy = minOf(secondBuy, price - firstProfit)
        maxTotalProfit = maxOf(maxTotalProfit, price - secondBuy)
    }
    return maxTotalProfit
}