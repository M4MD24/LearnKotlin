package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_19_coins

const val COIN_A = 'A'
const val COIN_B = 'B'
const val COIN_C = 'C'

fun main() {
    val countOfLines: Byte = 3
    var coinAValue: Byte = 0
    var coinBValue: Byte = 0
    var coinCValue: Byte = 0
    repeat(countOfLines.toInt()) {
        val (
            leftCoin,
            sign,
            rightCoin
        ) = readln().toCharArray()
        if (sign == '>')
            when (leftCoin) {
                COIN_A -> coinAValue++
                COIN_B -> coinBValue++
                COIN_C -> coinCValue++
            }
        else
            when (rightCoin) {
                COIN_A -> coinAValue++
                COIN_B -> coinBValue++
                COIN_C -> coinCValue++
            }
    }
    print(
        if (
            coinAValue == coinBValue &&
            coinBValue == coinCValue
        )
            "Impossible"
        else {
            val coins = hashMapOf<Byte, Char>()
            coins[coinAValue] = COIN_A
            coins[coinBValue] = COIN_B
            coins[coinCValue] = COIN_C
            coins.values.joinToString("")
        }
    )
}