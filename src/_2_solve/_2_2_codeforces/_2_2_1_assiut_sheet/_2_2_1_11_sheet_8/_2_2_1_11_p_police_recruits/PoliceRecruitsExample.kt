package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_p_police_recruits

fun main() {
    val evensCount = readln().toInt()
    val events = readln()
        .split(' ')
        .map { it.toInt() }
    var availableOfficers = 0
    var untreatedCrimes = 0
    for (event in events)
        if (event == -1)
            if (availableOfficers > 0)
                availableOfficers--
            else
                untreatedCrimes++
        else
            availableOfficers += event
    print(untreatedCrimes)
}