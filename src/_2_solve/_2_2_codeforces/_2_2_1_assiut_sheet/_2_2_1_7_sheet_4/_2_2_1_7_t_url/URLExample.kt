package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_t_url

fun main() {
    val urlText = readln()
    val queryParams = urlText
        .substringAfter('?')
        .split('&')
        .associate {
            it
                .split('=')
                .let { (key, value) -> key to value }
        }
    listOf(
        "username",
        "pwd",
        "profile",
        "role",
        "key"
    ).forEach { println("$it: ${queryParams[it]}") }
}