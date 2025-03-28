package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_q_bulbs

fun main() {
    val bulbCount = readln().toInt()
    val bulbs = readln()
        .split(' ')
        .map { it.toInt() }
    print(countBlueMoments(bulbs))
}

private fun countBlueMoments(bulbOrder: List<Int>): Int {
    var maximumTurnedOn = bulbOrder[0]
    var blueMoments = 0
    for (moment in bulbOrder.indices) {
        maximumTurnedOn = maxOf(maximumTurnedOn, bulbOrder[moment])
        if (maximumTurnedOn == moment + 1)
            blueMoments++
    }
    return blueMoments
}