package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_s_interval

fun main() {
    val targetValue = readln().toFloat()
    printCorrectInterval(targetValue)
}

private fun printCorrectInterval(targetValue: Float) {
    val intervals = arrayOf(
        intArrayOf(0, 25),
        intArrayOf(25, 50),
        intArrayOf(50, 75),
        intArrayOf(75, 100)
    )
    for (interval in intervals) {
        if (
            interval[0] <= targetValue &&
            interval[1] >= targetValue
        ) {
            print("Interval ")
            if (
                interval[0] < targetValue &&
                interval[1] >= targetValue &&
                interval[0] > 0
            )
                print("(")
            else
                print("[")
            print("${interval[0]},${interval[1]}]")
            return
        }
    }
    print("Out of Intervals")
}