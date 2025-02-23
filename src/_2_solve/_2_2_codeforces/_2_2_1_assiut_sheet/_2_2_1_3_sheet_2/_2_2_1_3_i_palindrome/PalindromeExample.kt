package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_i_palindrome

fun main() {
    val value = readln()
    val reversedValue = value.reversed().trimStart('0')
    println(reversedValue)
    print(
        if (value == reversedValue)
            "YES"
        else
            "NO"
    )
}