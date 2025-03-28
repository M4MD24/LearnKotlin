package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_r_cut_ribbon

fun main() {
    val (
        targetToCut,
        firstRibbon,
        secondRibbon,
        thirdRibbon
    ) = readln()
        .split(' ')
        .map { it.toShort() }
    print(getMaximumCountOfCut(targetToCut, firstRibbon, secondRibbon, thirdRibbon))
}

private fun getMaximumCountOfCut(
    targetToCut: Short,
    firstRibbon: Short,
    secondRibbon: Short,
    thirdRibbon: Short
): Short {
    var countOfCut: Short = 0
    for (round in 0..targetToCut / firstRibbon)
        for (index in 0..(targetToCut - firstRibbon * round) / secondRibbon) {
            val remaining = targetToCut - firstRibbon * round - secondRibbon * index
            if (remaining % thirdRibbon == 0) {
                val currentRibbon = (remaining / thirdRibbon).toShort()
                countOfCut = maxOf(
                    countOfCut,
                    (round + index + currentRibbon).toShort()
                )
            }
        }
    return countOfCut
}
