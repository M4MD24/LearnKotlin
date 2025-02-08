package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_27_search

fun main() {
    println(stringCheck("cloud", "u"))
    println(stringCheck("school", "o"))
    println(stringCheck("sofa", "k"))
    print(stringCheck("car", "r"))
}

private fun stringCheck(text: String, subString: String) = text.indexOf(subString)