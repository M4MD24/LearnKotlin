package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_81_is_number

fun main() {
    println(
        isNumber(
            "0"
        )
    )
    println(
        isNumber(
            "-123.456e789"
        )
    )
    println(
        isNumber(
            "53.5e93"
        )
    )
    print(
        isNumber(
            "abc"
        )
    )
}

private fun isNumber(text : String) : Boolean {
    try {
        text.toDouble()
        return true
    } catch (_ : Exception) {
        return false
    }
}