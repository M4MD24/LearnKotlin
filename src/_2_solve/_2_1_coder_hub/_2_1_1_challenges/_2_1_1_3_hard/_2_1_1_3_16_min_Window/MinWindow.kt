package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_16_min_Window

fun main() {
    print(
        minimumWindow(
            "ADOBECODEBANC",
            "ABC"
        )
    )
}

private fun minimumWindow(sourceText: String, targetText: String): String {
    if (
        sourceText.isEmpty() ||
        targetText.isEmpty()
    )
        return ""

    val targetCount = mutableMapOf<Char, Int>()
    for (character in targetText)
        targetCount[character] = targetCount.getOrDefault(
            character,
            0
        ) + 1

    val windowCount = mutableMapOf<Char, Int>()
    var have = 0
    val need = targetCount.size

    var left = 0
    var minLen = Int.MAX_VALUE
    var minStart = 0

    for (right in sourceText.indices) {
        val character = sourceText[right]
        windowCount[character] = windowCount.getOrDefault(
            character,
            0
        ) + 1

        if (
            targetCount.containsKey(character) &&
            windowCount[character] == targetCount[character]
        )
            have++

        while (have == need) {
            if ((right - left + 1) < minLen) {
                minLen = right - left + 1
                minStart = left
            }

            val leftChar = sourceText[left]
            windowCount[leftChar] = windowCount[leftChar]!! - 1
            if (
                targetCount.containsKey(leftChar) &&
                windowCount[leftChar]!! < targetCount[leftChar]!!
            )
                have--
            left++
        }
    }

    return if (minLen == Int.MAX_VALUE)
        ""
    else
        sourceText.substring(
            minStart,
            minStart + minLen
        )
}