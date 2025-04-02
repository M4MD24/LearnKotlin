package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_22

import kotlin.math.pow

/**
 * Write a Kotlin function that calculates the sum of a given arithmetic or geometric series. The function should take the first term, common difference/ratio, and the number of terms as arguments. Use generic types to handle both arithmetic and geometric series.
 * */

fun main() {
    val firstTerm = 2
    val commonDifference = 3
    val numberOfTerms = 5
    print(
        """
        First Term: $firstTerm
        Common Difference: $commonDifference
        Number of Terms: $numberOfTerms
        Arithmetic Sum = ${
            calculateSeriesSum(
                firstTerm,
                Arithmetic(commonDifference),
                numberOfTerms
            )
        }
        Geometric Sum = ${
            calculateSeriesSum(
                firstTerm,
                Geometric(commonDifference),
                numberOfTerms
            )
        }""".trimIndent()
    )
}

private sealed class SeriesType<T>
private class Arithmetic<T : Number>(val commonDifference: T) : SeriesType<T>()
private class Geometric<T : Number>(val commonRatio: T) : SeriesType<T>()

private fun <T : Number> calculateSeriesSum(
    firstTerm: T,
    seriesType: SeriesType<T>,
    numberOfTerms: Int
) = when (seriesType) {
    is Arithmetic -> numberOfTerms / 2.0 *
            (2 * firstTerm.toDouble() + (numberOfTerms - 1) *
                    seriesType.commonDifference.toDouble())

    is Geometric -> if (seriesType.commonRatio.toDouble() == 1.0)
        numberOfTerms * firstTerm.toDouble()
    else firstTerm.toDouble() *
            (1 - seriesType.commonRatio.toDouble().pow(numberOfTerms.toDouble())) /
            (1 - seriesType.commonRatio.toDouble())
}