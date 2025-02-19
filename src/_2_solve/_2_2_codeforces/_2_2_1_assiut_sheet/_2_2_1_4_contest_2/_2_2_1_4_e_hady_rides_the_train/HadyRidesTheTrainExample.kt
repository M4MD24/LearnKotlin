package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_4_contest_2._2_2_1_4_e_hady_rides_the_train

fun main() {
    val id = readln().toLong()
    val rowOfID = id / 4
    val columnOfID = if (rowOfID % 2 == 0L)
        id % 4
    else
        3 - (id % 4)
    print("$rowOfID $columnOfID")
}