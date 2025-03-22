package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_12_twins

fun main() {
    val countOfCoins = readln().toInt()
    val coins = readln()
        .split(' ')
        .map { it.toInt() }
        .sortedDescending()
    val totalCurrencies = coins.sum()

    var currentTotalCurrencies = 0
    var minimumCoinsNeeded = 0

    for (coin in coins) {
        currentTotalCurrencies += coin
        minimumCoinsNeeded++
        if (currentTotalCurrencies > totalCurrencies - currentTotalCurrencies)
            print(minimumCoinsNeeded).also { return }
    }
}