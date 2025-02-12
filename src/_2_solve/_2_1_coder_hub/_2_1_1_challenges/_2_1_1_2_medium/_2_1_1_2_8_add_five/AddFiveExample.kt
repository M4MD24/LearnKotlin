package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_8_add_five

fun main() {
    println(addFive(mutableListOf("code", "c")))
    println(addFive(mutableListOf("test", "t")))
    println(addFive(mutableListOf("null")))
    print(addFive(mutableListOf("book", "pen", "pencil")))
}

private fun addFive(words: MutableList<String>): MutableList<String> {
    for (index in words.indices)
        words[index] += "5"
    return words
}