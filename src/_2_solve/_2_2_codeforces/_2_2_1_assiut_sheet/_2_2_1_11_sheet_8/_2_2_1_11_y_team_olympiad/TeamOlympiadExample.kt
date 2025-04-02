package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_y_team_olympiad

fun main() {
    val studentCount = readln().toShort()
    val skillList = readln()
        .split(' ')
        .map { it.toByte() }

    val programmersStudents = mutableListOf<Int>()
    val mathematiciansStudents = mutableListOf<Int>()
    val athletesStudents = mutableListOf<Int>()
    for (index in skillList.indices) {
        when (skillList[index]) {
            1.toByte() -> programmersStudents.add(index + 1)
            2.toByte() -> mathematiciansStudents.add(index + 1)
            3.toByte() -> athletesStudents.add(index + 1)
        }
    }

    val maximumTeams = minOf(
        programmersStudents.size,
        mathematiciansStudents.size,
        athletesStudents.size
    )
    println(maximumTeams)
    for (index in 0..<maximumTeams)
        println("${programmersStudents[index]} ${mathematiciansStudents[index]} ${athletesStudents[index]}")
}