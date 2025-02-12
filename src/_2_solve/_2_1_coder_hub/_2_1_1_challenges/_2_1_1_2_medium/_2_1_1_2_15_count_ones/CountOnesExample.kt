package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_15_count_ones

fun main() = print(getCountOfOnes(readln().toInt()))

private fun getCountOfOnes(number: Int): Int {
    var countOfOnes = 0
    val numberAfterConvertedToBinary = Integer.toBinaryString(number)
    for (index in 0 until numberAfterConvertedToBinary.length)
        if (numberAfterConvertedToBinary[index].code - '0'.code == 1)
            countOfOnes++
    return countOfOnes
}