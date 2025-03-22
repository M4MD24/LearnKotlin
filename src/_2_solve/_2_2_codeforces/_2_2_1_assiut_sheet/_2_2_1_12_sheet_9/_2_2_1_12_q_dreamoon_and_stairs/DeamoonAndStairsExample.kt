package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_q_dreamoon_and_stairs

fun main() {
    val line = readln().split(' ')
    val stairs = line[0].toShort()
    val targetNumber = line[1].toByte()
    print(
        getCountOfClimbedStairs(
            stairs,
            targetNumber
        )
    )
}

private fun getCountOfClimbedStairs(
    stairs: Short,
    targetNumber: Byte
): Short {
    var countOfClimbedStairs: Short = if (stairs % 2 == 0)
        (stairs / 2).toShort()
    else
        (stairs / 2 + 1).toShort()
    while (countOfClimbedStairs < stairs)
        if (countOfClimbedStairs % targetNumber == 0)
            break
        else
            countOfClimbedStairs++
    return if (countOfClimbedStairs % targetNumber == 0)
        countOfClimbedStairs
    else
        -1
}

// >
/*
private fun getCountOfClimbedStairs(
    stairs: Short,
    targetNumber: Byte
): Short {
    var minimumMoves:Short = ((stairs + 1) / 2).toShort()

    while (minimumMoves % targetNumber != 0)
        minimumMoves++

    return if (minimumMoves <= stairs)
        minimumMoves
    else
        -1
}
*/