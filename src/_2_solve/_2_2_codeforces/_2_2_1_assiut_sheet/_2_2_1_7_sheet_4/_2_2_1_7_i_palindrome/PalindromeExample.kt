package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_i_palindrome

fun main() {
    val text = readln()
    print(
        if (text == text.reversed())
            "YES"
        else
            "NO"
    )
}