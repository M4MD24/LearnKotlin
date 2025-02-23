package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_x_two_intervals

fun main() {
    val (
        firstLeft,
        firstRight,
        secondLeft,
        secondRight
    ) = readln()
        .split(" ")
        .map { it.toInt() }
    val start = maxOf(firstLeft, secondLeft)
    val end = minOf(firstRight, secondRight)
    print(
        if (start <= end)
            "$start $end"
        else {
            "-1"
        }
    )
}