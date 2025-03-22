package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_11_puzzles

fun main() {
    val (
        studentsCount,
        puzzlesCount
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val puzzlePieces = readln()
        .split(' ')
        .map { it.toShort() }
        .sorted()

    var minimumPieceDifference = Int.MAX_VALUE
    for (startIndex in 0..puzzlesCount - studentsCount) {
        val currentDifference = puzzlePieces[startIndex + studentsCount - 1] - puzzlePieces[startIndex]
        minimumPieceDifference = minOf(minimumPieceDifference, currentDifference)
    }

    print(minimumPieceDifference)
}

// >
/*
fun main() {
    val (
        studentsCount,
        puzzlesCount
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val puzzlePieces = readln()
        .split(' ')
        .map { it.toShort() }
        .sorted()

    var minimumPieceDifference = calculateDifference(
        puzzlePieces,
        0,
        studentsCount
    )
    for (startIndex in 1..puzzlesCount - studentsCount) {
        minimumPieceDifference = minOf(
            minimumPieceDifference,
            calculateDifference(
                puzzlePieces,
                startIndex,
                studentsCount
            )
        )
    }

    print(minimumPieceDifference)
}

private fun calculateDifference(
    puzzlePieces: List<Short>,
    startIndex: Int,
    studentsCount: Byte
) = puzzlePieces[startIndex + studentsCount - 1] - puzzlePieces[startIndex]
*/