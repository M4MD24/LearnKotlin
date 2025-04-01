package coderhub.challenges

fun main() {
    println(calculateActiveDonationMinutes(mutableListOf("60-120")))
    println(calculateActiveDonationMinutes(mutableListOf("60-120", "110-180")))
    println(calculateActiveDonationMinutes(mutableListOf("60-120", "130-150")))
    print(calculateActiveDonationMinutes(mutableListOf("0-30", "25-50", "45-60")))
}

private fun calculateActiveDonationMinutes(intervals: MutableList<String>): Int {
    if (intervals.isEmpty())
        return 0

    val parsedIntervals = intervals.map {
        val (
            start,
            end
        ) = it
            .split('-')
            .map(String::toInt)
        start to end
    }.sortedBy { it.first }

    val mergedIntervals = mutableListOf<Pair<Int, Int>>()
    var current = parsedIntervals[0]
    for (interval in parsedIntervals.drop(1))
        if (interval.first <= current.second)
            current = current.first to maxOf(current.second, interval.second)
        else {
            mergedIntervals.add(current)
            current = interval
        }
    mergedIntervals.add(current)

    return mergedIntervals.sumOf { it.second - it.first }
}