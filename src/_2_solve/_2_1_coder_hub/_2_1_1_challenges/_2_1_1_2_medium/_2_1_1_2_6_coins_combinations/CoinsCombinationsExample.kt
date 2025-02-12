package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_6_coins_combinations

fun main() {
    println(getCountOfCoinsCombinations(4, mutableListOf(1, 2)))
    println(getCountOfCoinsCombinations(10, mutableListOf(5, 2, 3)))
    println(getCountOfCoinsCombinations(0, mutableListOf(3, 5, 7)))
    print(getCountOfCoinsCombinations(11, mutableListOf(5, 7)))
}

private fun getCountOfCoinsCombinations(amount: Int, coins: MutableList<Int>): Int {
    val numbersOfCoinsCombinations = IntArray(amount + 1)
    numbersOfCoinsCombinations[0] = 1
    for (coin in coins)
        for (index in coin..amount)
            numbersOfCoinsCombinations[index] += numbersOfCoinsCombinations[index - coin]
    return numbersOfCoinsCombinations[amount]
}