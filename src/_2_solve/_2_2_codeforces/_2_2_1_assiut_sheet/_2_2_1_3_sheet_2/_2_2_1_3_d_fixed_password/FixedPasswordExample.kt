package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_d_fixed_password

private const val CORRECT_PASSWORD: Short = 1999
fun main() {
    while (true) {
        val number = readln().toShort()
        if (number == CORRECT_PASSWORD) {
            print("Correct")
            return
        }
        println("Wrong")
    }
}