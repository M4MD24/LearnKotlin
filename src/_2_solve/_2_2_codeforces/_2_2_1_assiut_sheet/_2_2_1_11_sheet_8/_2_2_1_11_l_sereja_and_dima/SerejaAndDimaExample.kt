package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_l_sereja_and_dima

fun main() {
    val countOfCars = readln().toInt()
    val cards = readln()
        .split(' ')
        .map { it.toInt() }
        .toMutableList()
    var serejaScore = 0
    var dimaScore = 0
    var isSerejaTurn = true
    while (cards.isNotEmpty()) {
        val chosenCard = if (cards.first() > cards.last())
            cards.removeAt(0)
        else
            cards.removeAt(cards.lastIndex)
        if (isSerejaTurn)
            serejaScore += chosenCard
        else
            dimaScore += chosenCard
        isSerejaTurn = !isSerejaTurn
    }
    print("$serejaScore $dimaScore")
}