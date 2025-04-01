package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_77_distribute_gifts

fun main() {
    val testCases = mutableListOf(
        mutableListOf(4) to mutableListOf(20),
        mutableListOf(5) to mutableListOf(25),
        mutableListOf(4, 5) to mutableListOf(20, 25),
        mutableListOf(2, 3) to mutableListOf(8, 9)
    )
    for ((familySizes, totalGifts) in testCases)
        println(distributeGifts(familySizes, totalGifts))
}

private fun distributeGifts(
    familySizes: MutableList<Int>,
    totalGifts: MutableList<Int>
) = familySizes.zip(totalGifts) { familySize, totalGift ->
    totalGift / familySize
}.toMutableList()