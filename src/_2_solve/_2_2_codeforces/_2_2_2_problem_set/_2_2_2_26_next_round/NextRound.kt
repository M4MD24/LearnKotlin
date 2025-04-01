package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_26_next_round

fun main() {
    val (
        totalParticipants,
        qualifyingPosition
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val participantScores = readln()
        .split(' ')
        .map { it.toByte() }
    val qualifyingScore = participantScores[qualifyingPosition - 1]
    print(participantScores.count {
        it >= qualifyingScore &&
                it > 0
    })
}