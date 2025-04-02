package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_s_mahmoud_and_a_triangle

fun main() {
    val segmentCount = readln().toInt()
    val segmentLengths = readln()
        .split(' ')
        .map { it.toInt() }
        .sorted()
    print(canNonDecomposedTriangleBeFound(segmentCount, segmentLengths))
}

private fun canNonDecomposedTriangleBeFound(
    segmentCount: Int,
    segmentLengths: List<Int>
): String {
    for (index in 0..<segmentCount - 2)
        if (segmentLengths[index] + segmentLengths[index + 1] > segmentLengths[index + 2]) {
            return "YES"
        }
    return "NO"
}