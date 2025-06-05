package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_17_distribute_sacrifice_shares

fun main() {
    print(
        distributeSacrificeShares(
            mutableListOf(2, 3),
            25.0
        )
    )
}

private fun distributeSacrificeShares(
    familySizes : MutableList<Int>,
    totalWeight : Double
) = familySizes.map { it * totalWeight / familySizes.sum() }.toMutableList()