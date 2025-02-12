package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_7_word_length

fun main() {
    println(getWordsLength(mutableListOf("Code", "hub")))
    println(getWordsLength(mutableListOf("dropbox", "google", "page")))
    println(getWordsLength(mutableListOf("java", "Islam", "javascript", "python")))
    print(getWordsLength(mutableListOf("programming", "languages")))
}

private fun getWordsLength(words: MutableList<String>): MutableList<Int> {
    val countOfWords = words.size
    val wordsLength = mutableListOf<Int>()
    for (index in 0 until countOfWords)
        wordsLength.add(words[index].length)
    return wordsLength
}