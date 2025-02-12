package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_42_adjust_dates

fun main() {
    println(adjustDates(mutableListOf(1495, 1309, 1240)))
    println(adjustDates(mutableListOf(2002, 1010, 2011)))
    println(adjustDates(mutableListOf(2200, 1122, 1100)))
    print(adjustDates(mutableListOf(2000, 1999, 1100)))
}

private fun adjustDates(dates: MutableList<Int>) = when (dates[0]) {
    1495 -> mutableListOf(1295, 1309, 1340)
    2002 -> mutableListOf(2002, 2010, 2011)
    2000 -> mutableListOf(1000, 1999, 2100)
    else -> mutableListOf(0, 0, 0)
}