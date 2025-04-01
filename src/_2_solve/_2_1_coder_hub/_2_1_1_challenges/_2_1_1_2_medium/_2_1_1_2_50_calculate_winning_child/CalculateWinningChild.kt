package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_50_calculate_winning_child

fun main() {
    val testCases = mutableListOf(
        mutableListOf("سامي", "ليلى", "أحمد") to mutableListOf("10,15,20", "20,15,10", "15,15,15"),
        mutableListOf("سامي", "ليلى", "أحمد") to mutableListOf("10,15,20", "20,15,11", "15,15,15"),
        mutableListOf("علي", "منى") to mutableListOf("30,10", "20,15"),
        mutableListOf("فاطمة") to mutableListOf("50,50")
    )
    for ((names, scores) in testCases)
        println(calculateWinningChild(names, scores))
}

private fun calculateWinningChild(
    names: MutableList<String>,
    scores: MutableList<String>
): String {
    val nameScores = names.zip(scores) { name, score ->
        name to score
            .split(',')
            .sumOf { it.toInt() }
    }.toMap()

    val maximumScore = nameScores.values.maxOrNull() ?: return "لا يوجد بيانات"
    val winners = nameScores.filterValues { it == maximumScore }.keys

    return "فائز العيد: ${winners.joinToString(", ")} بمجموع $maximumScore"
}

/*
private fun calculateWinningChild(
    names: MutableList<String>,
    scores: MutableList<String>
): String {
    val nameScores = names.mapIndexed { index, name ->
        name to scores[index]
            .split(',')
            .sumOf { it.toInt() }
    }.toMap()

    val maximumScore = nameScores.values.maxOrNull() ?: return "لا يوجد بيانات"
    val winners = nameScores.filterValues { it == maximumScore }.keys

    return "فائز العيد: ${winners.joinToString(", ")} بمجموع $maximumScore"
}
*/