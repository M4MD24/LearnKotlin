package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_v_pum

fun main() {
    val targetNumber = readln().toByte()
    printPUMS(targetNumber)
}

private fun printPUMS(targetNumber: Byte) {
    var round = 0
    var index = 1
    var end = 5
    while (round < targetNumber) {
        while (index < end) {
            if (index % 4 != 0)
                print("$index ")
            else {
                print("PUM")
                if (round != targetNumber - 1)
                    println()
            }
            index++
        }
        round++
        end += 4
    }
}