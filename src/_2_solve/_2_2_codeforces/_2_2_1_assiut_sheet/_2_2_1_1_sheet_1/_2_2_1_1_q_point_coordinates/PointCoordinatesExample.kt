package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_q_point_coordinates

fun main() {
    val line = readln().split(' ')
    val latitude = line[0].toFloat()
    val longitude = line[1].toFloat()
    print(coordinatesPoint(latitude, longitude))
}

const val coordinatesPoint = "Q"
private fun coordinatesPoint(latitude: Float, longitude: Float) = if (
    latitude > 0 &&
    longitude > 0
) coordinatesPoint + 1
else if (
    latitude < 0 &&
    longitude > 0
) coordinatesPoint + 2
else if (
    latitude < 0 &&
    longitude < 0
) coordinatesPoint + 3
else if (
    latitude > 0 &&
    longitude < 0
) coordinatesPoint + 4
else if (
    latitude == 0F &&
    longitude == 0F
) "Origem"
else if (latitude != 0F)
    "Eixo X"
else
    "Eixo Y"