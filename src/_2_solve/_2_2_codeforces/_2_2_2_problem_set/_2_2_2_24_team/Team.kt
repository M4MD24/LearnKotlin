package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_24_team

fun main() {
    val problemCount = readln().toShort()
    var solvableProblems = 0
    repeat(problemCount.toInt()) {
        val (
            petyaNumber,
            vasyaNumber,
            tonyaNumber
        ) = readln()
            .split(' ')
            .map { it.toShort() }
        if (petyaNumber + vasyaNumber + tonyaNumber >= 2)
            solvableProblems++
    }
    print(solvableProblems)
}