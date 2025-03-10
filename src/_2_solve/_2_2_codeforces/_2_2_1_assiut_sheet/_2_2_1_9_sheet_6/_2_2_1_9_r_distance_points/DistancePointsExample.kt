package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_r_distance_points

import kotlin.math.hypot

fun main() {
    val (
        firstLatitude,
        firstLongitude,
        secondLatitude,
        secondLongitude
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val latitude = firstLatitude - secondLatitude
    val longitude = firstLongitude - secondLongitude
    val distancePoints = hypot(
        latitude.toDouble(),
        longitude.toDouble()
    )
    print("%.5f".format(distancePoints))
}