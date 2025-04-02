package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_23_way_too_long_words

fun main() {
    val wordCount = readln().toByte()
    repeat(wordCount.toInt()) {
        val word = readln()
        println(
            if (word.length > 10)
                "${word.first()}${word.length - 2}${word.last()}"
            else
                word
        )
    }
}