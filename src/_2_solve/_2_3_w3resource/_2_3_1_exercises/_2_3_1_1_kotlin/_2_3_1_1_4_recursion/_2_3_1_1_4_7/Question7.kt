package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_7

/**
 * Write a Kotlin recursive function to find the nth term of the arithmetic sequence.
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
        The $numberOfTerms-th term of the arithmetic sequence is: = ${
            findNthTerm(
                firstTerm,
                commonDifference,
                numberOfTerms
            )
        }""".trimIndent()
    )
}

private fun findNthTerm(
    firstTerm: Int,
    commonDifference: Int,
    position: Int
): Int = if (position == 1)
    firstTerm
else
    commonDifference + findNthTerm(
        firstTerm,
        commonDifference,
        position - 1
    )