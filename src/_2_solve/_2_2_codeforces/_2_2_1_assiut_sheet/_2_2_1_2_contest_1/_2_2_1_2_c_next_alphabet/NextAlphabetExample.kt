package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_2_contest_1._2_2_1_2_c_next_alphabet

fun main() {
    val currentAlphabet = readln()[0]
    print(getNextAlphabet(currentAlphabet))
}

private fun getNextAlphabet(currentAlphabet: Char) =
    if (currentAlphabet != 'z')
        currentAlphabet + 1
    else
        'a'