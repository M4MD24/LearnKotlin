package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_v_balanced_rating_changes

import kotlin.math.ceil
import kotlin.math.floor

fun main() {
    val countOfParticipants = readln().toShort()
    var isFloored = false
    repeat(countOfParticipants.toInt()) {
        val currentParticipants = readln().toShort()
        isFloored = adjustRatingChange(
            currentParticipants,
            isFloored
        )
    }
}

private fun adjustRatingChange(
    currentNumber: Short,
    isFloored: Boolean
): Boolean {
    val halfNumber = currentNumber.toDouble() / 2
    if (currentNumber % 2 == 0)
        println(halfNumber.toInt().toShort())
    else {
        if (isFloored)
            println(
                ceil(halfNumber)
                    .toInt()
                    .toShort()
            )
        else
            println(
                floor(halfNumber)
                    .toInt()
                    .toShort()
            )
        return !isFloored
    }
    return isFloored
}