package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_62_cone_volume

fun main() = print(getConeVolume(readln().toDouble(), readln().toDouble()))

private const val PI = 3.14
private fun getConeVolume(radius: Double, right: Double): Double {
    return 1.0 /
            3.0 *
            right *
            PI *
            radius *
            radius
}