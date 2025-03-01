package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_n_max_sub_sequence

fun main() {
    val countOfLetters = readln().toInt()
    val text = readln()
    println(getCountOfMaximumSubText(text, countOfLetters))
}

private fun getCountOfMaximumSubText(
    text: String,
    countOfLetters: Int
): Int {
    var countOfMaximumSubText = 1
    for (index in 1..<countOfLetters)
        if (text[index - 1] != text[index])
            countOfMaximumSubText++
    return countOfMaximumSubText
}