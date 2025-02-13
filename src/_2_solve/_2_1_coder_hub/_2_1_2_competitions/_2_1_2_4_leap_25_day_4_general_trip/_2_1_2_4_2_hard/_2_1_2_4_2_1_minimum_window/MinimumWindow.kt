package _2_solve._2_1_coder_hub._2_1_2_competitions._2_1_2_4_leap_25_day_4_general_trip._2_1_2_4_2_hard._2_1_2_4_2_1_minimum_window

fun main() = print(
    minimumWindow(
        readln(),
        readln()
    )
)

private fun minimumWindow(sourceText: String, targetText: String): String {
    if (sourceText.length < targetText.length) return ""
    else {
        val requiredCharacters = IntArray(128)
        for (character in targetText.toCharArray())
            requiredCharacters[character.code]++
        var startIndex = 0
        var endIndex = 0
        var charactersToMatch = targetText.length
        var minimumWindowStart = 0
        var minimumWindowLength = Int.MAX_VALUE
        while (endIndex < sourceText.length) {
            if (requiredCharacters[sourceText[endIndex++].code]-- > 0)
                charactersToMatch--
            while (charactersToMatch == 0) {
                if (endIndex - startIndex < minimumWindowLength) {
                    minimumWindowStart = startIndex
                    minimumWindowLength = endIndex - startIndex
                }
                if (requiredCharacters[sourceText[startIndex++].code]++ == 0)
                    charactersToMatch++
            }
        }
        return if (minimumWindowLength == Int.MAX_VALUE)
            ""
        else
            sourceText.substring(minimumWindowStart, minimumWindowStart + minimumWindowLength)
    }
}