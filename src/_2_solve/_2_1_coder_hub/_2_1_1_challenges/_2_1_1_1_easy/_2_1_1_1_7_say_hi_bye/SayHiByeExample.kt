package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_7_say_hi_bye

fun main() = print(sayHiBye(readln(), readln().toInt()))

private fun sayHiBye(text: String, number: Int) = if (number == 0)
    "Bye $text"
else
    "Hi $text"