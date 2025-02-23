package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_4_contest_2._2_2_1_4_a_timon_and_pumbaa

fun main() {
    val (timonCandies, pumbaaCandies) = readln()
        .split(' ')
        .map { it.toInt() }
    pumbaaAskedTimonToTellHimHowMuchCandies(timonCandies, pumbaaCandies)
}

private fun pumbaaAskedTimonToTellHimHowMuchCandies(
    timonCandies: Int,
    pumbaaCandies: Int
) {
    val timonCanTellPumbaaHowMuchCandyHeHas = timonCandies > pumbaaCandies
    if (timonCanTellPumbaaHowMuchCandyHeHas)
        tellHim(timonCandies, pumbaaCandies)
    else
        doNotTellHim()
}

private fun doNotTellHim() = print(0)

private fun tellHim(
    timonCandies: Int,
    pumbaaCandies: Int
) = print(timonCandies - pumbaaCandies)