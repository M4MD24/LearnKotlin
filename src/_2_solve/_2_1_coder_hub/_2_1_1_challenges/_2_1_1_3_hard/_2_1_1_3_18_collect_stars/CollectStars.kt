package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_18_collect_stars

fun main() {
    println(collectStars(mutableListOf(5, 3, 8, 6, 2), 14))
    println(collectStars(mutableListOf(5, 5, 5, 5), 10))
    println(collectStars(mutableListOf(1, 2, 3, 2), 5))
    print(collectStars(mutableListOf(9, 1, 5), 8))
}

fun collectStars(
    brightnessValues : MutableList<Int>,
    maximumCapacity : Int
) : MutableList<Int> {
    val isReachable = BooleanArray(maximumCapacity + 1)
    val previousSumStep = IntArray(maximumCapacity + 1) { -1 }
    val starIndexUsed = IntArray(maximumCapacity + 1) { -1 }
    isReachable[0] = true

    for (brightnessIndex in brightnessValues.indices)
        for (currentCapacity in maximumCapacity downTo brightnessValues[brightnessIndex])
            if (
                isReachable[currentCapacity - brightnessValues[brightnessIndex]] &&
                !isReachable[currentCapacity]
            ) {
                isReachable[currentCapacity] = true
                previousSumStep[currentCapacity] = currentCapacity - brightnessValues[brightnessIndex]
                starIndexUsed[currentCapacity] = brightnessIndex
            }
    var bestSum = maximumCapacity
    while (bestSum > 0 && !isReachable[bestSum])
        bestSum--
    val collectedBrightnessValues = mutableListOf<Int>()
    while (bestSum > 0) {
        collectedBrightnessValues += brightnessValues[starIndexUsed[bestSum]]
        bestSum = previousSumStep[bestSum]
    }

    return collectedBrightnessValues
}