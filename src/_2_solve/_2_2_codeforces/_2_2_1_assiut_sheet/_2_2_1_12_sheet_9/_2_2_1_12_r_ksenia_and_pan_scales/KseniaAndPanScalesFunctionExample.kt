package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_r_ksenia_and_pan_scales

fun main() {
    val (
        leftAndRightPanScale,
        availableWeights
    ) = List(2) { readln() }
    var (
        leftPan,
        rightPan
    ) = leftAndRightPanScale
        .split("|")
        .let { it[0] to it[1] }

    val totalWeightCount = leftPan.length + rightPan.length + availableWeights.length

    print(
        if (totalWeightCount % 2 != 0)
            "Impossible"
        else {

            val targetWeightCount = totalWeightCount / 2

            availableWeights.forEach { weight ->
                if (leftPan.length < targetWeightCount)
                    leftPan += weight
                else
                    rightPan += weight
            }

            if (
                leftPan.length == targetWeightCount &&
                rightPan.length == targetWeightCount
            )
                "$leftPan|$rightPan"
            else
                "Impossible"
        }
    )
}