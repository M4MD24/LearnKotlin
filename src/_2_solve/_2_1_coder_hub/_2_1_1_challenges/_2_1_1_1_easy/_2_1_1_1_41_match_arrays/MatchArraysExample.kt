package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_41_match_arrays

fun main() {
    println(matchArrays(mutableListOf("hello", "there", "word2"), mutableListOf("hello", "there", "word2")))
    println(matchArrays(mutableListOf("hello", "word2"), mutableListOf("hello", "there", "word2")))
    println(matchArrays(mutableListOf("hello", "there", "word2"), mutableListOf("hello", "word2")))
    print(matchArrays(mutableListOf("hello", "there", "word2"), mutableListOf("word2", "there", "hello")))
}

private fun matchArrays(firstTexts: MutableList<String>, secondTexts: MutableList<String>): Boolean {
    firstTexts.sort()
    secondTexts.sort()
    return firstTexts == secondTexts
}