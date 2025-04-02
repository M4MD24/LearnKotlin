package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_x_comparison

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Arrays

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    print(maximumSubString(StringBuffer(input.readLine())))
}

private fun maximumSubString(text: StringBuffer): StringBuffer {
    var maximumSubString = StringBuffer(text)
    var index: Short = 0
    while (index + 1 < text.length) {
        val part1 = text.substring(0, index + 1).toCharArray()
        val part2 = text.substring(index + 1).toCharArray()
        if (part1.size > 1)
            Arrays.sort(part1)
        if (part2.size > 1)
            Arrays.sort(part2)
        val totalSubStrings = StringBuffer(String(part1) + String(part2))
        if (totalSubStrings.toString() < maximumSubString.toString())
            maximumSubString = totalSubStrings
        index++
    }
    return maximumSubString
}