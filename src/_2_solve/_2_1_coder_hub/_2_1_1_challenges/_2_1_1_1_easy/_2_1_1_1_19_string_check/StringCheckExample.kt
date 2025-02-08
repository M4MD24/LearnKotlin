package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_19_string_check

fun main() {
    println(stringCheck(mutableListOf("Code", "Code", "Code")))
    println(stringCheck(mutableListOf("Hi", "By")))
    println(stringCheck(mutableListOf("Cup", "Cup")))
    print(stringCheck(mutableListOf("Book", "Water")))
}

private fun stringCheck(texts: MutableList<String>): Boolean {
    val targetText = texts[0]
    for (text in texts)
        if (targetText != text)
            return false
    return true
}