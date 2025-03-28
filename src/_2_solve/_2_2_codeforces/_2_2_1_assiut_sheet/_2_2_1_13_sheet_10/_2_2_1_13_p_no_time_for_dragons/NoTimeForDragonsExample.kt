package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_p_no_time_for_dragons

fun main() {
    val countOfRounds = readln().toInt()
    val rounds = Array(countOfRounds) {
        val (
            countOfSoldiers,
            countOfDeadSoldiers
        ) = readln()
            .split(' ')
            .map { it.toInt() }
        val round = Round()
        round.countOfSoldiers = countOfSoldiers
        round.countOfDeadSoldiers = countOfDeadSoldiers
        round.countOfRemainingSoldiers = countOfSoldiers - countOfDeadSoldiers
        round
    }
    print(getMinimumSoldiersNeeded(rounds))
}

private fun getMinimumSoldiersNeeded(
    rounds: Array<Round>,
    countOfRounds: Int = rounds.size
): Long {
    rounds.sortBy { it.countOfRemainingSoldiers }
    var countOfSoldiersNeeded: Long = rounds[countOfRounds - 1].countOfSoldiers.toLong()
    var countOfRemainingSoldiers = rounds[countOfRounds - 1].countOfRemainingSoldiers
    for (index in countOfRounds - 2 downTo 0)
        if (countOfRemainingSoldiers < rounds[index].countOfSoldiers) {
            countOfSoldiersNeeded += rounds[index].countOfSoldiers - countOfRemainingSoldiers
            countOfRemainingSoldiers = rounds[index].countOfRemainingSoldiers
        } else
            countOfRemainingSoldiers -= rounds[index].countOfDeadSoldiers
    return countOfSoldiersNeeded;
}

private class Round {
    var countOfSoldiers = 0
    var countOfDeadSoldiers = 0
    var countOfRemainingSoldiers = 0
}