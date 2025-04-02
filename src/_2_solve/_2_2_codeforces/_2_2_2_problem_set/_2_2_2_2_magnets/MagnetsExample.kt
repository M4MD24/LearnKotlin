package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_2_magnets

fun main() {
    val countOfMagnets = getNumber()
    var countOfGroupsOfMagnets = 1
    var lastMagnet = getNumber()
    repeat(countOfMagnets - 1) {
        val currentMagnet = getNumber()
        if (currentMagnet != lastMagnet)
            countOfGroupsOfMagnets++
        lastMagnet = currentMagnet
    }
    print(countOfGroupsOfMagnets)
}

private fun getNumber() = readln().toInt()