package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_16_football

fun main() {
    val goalCount = readln().toByte()
    val teamScores = hashMapOf<String, Int>()
    repeat(goalCount.toInt()) {
        val teamName = readln()
        teamScores[teamName] = teamScores.getOrDefault(
            teamName,
            0
        ) + 1
    }
    print(teamScores.maxByOrNull { it.value }!!.key)
}

// >
/*
fun main() = print(
    List(
        readln()
            .toByte()
            .toInt()
    ) { readln() }
        .groupingBy { it }
        .eachCount()
        .maxByOrNull { it.value }!!
        .key
)
*/

// >
/*
fun main() {
    val teamScores = List(readln().toByte().toInt()) { readln() }
        .groupingBy { it }
        .eachCount()
    print(
        teamScores
            .maxByOrNull { it.value }!!
            .key
    )
}
*/