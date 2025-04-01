package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_k_snacktower

fun main() {
    val totalSnacks = readln().toInt()
    val available = BooleanArray(totalSnacks + 1)
    var nextSnack = totalSnacks
    val items = readln()
        .split(' ')
        .map { it.toInt() }
    items.forEach { snack ->
        available[snack] = true
        while (
            nextSnack > 0 &&
            available[nextSnack]
        )
            print("${nextSnack--} ")
        println()
    }
}