package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_22_merge_shadow_signals

fun mergeShadowSignals(streamA: MutableList<Int>, streamB: MutableList<Int>, tolerance: Int): MutableList<Int> {
    val merged = (streamA + streamB).sorted()
    if (merged.isEmpty()) return mutableListOf()
    val result = mutableListOf<Int>()
    var currentRepresentative = merged[0]
    for (timestamp in merged)
        if (timestamp - currentRepresentative > tolerance) {
            result.add(currentRepresentative)
            currentRepresentative = timestamp
        }
    result.add(currentRepresentative)
    return result
}

fun main() {
    val testCases = listOf(
        Triple(mutableListOf(1, 5, 10), mutableListOf(2, 6, 12), 0),
        Triple(mutableListOf(1, 5, 10), mutableListOf(2, 6, 12), 1),
        Triple(mutableListOf(10, 12), mutableListOf(13, 14), 3),
        Triple(mutableListOf(), mutableListOf(1, 2, 3), 2)
    )
    for ((streamA, streamB, tolerance) in testCases) {
        println(mergeShadowSignals(streamA, streamB, tolerance))
    }
}