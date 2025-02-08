package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_21_word_repeat

fun main() {
    print(wordRepeat(readln(), readln().toInt()))
}

private fun wordRepeat(word: String, repeatNumber: Int) = if (repeatNumber == 1)
    word
else
    ("$word ").repeat(repeatNumber - 1) + word