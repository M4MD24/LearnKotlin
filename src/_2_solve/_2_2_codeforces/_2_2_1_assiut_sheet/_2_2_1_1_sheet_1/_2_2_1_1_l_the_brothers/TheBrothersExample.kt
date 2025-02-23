package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_l_the_brothers

fun main() {
    val firstName = readln().split(' ')
    val secondName = readln().split(' ')
    val fatherFirstName = firstName[1]
    val fatherSecondName = secondName[1]
    print(
        if (fatherFirstName == fatherSecondName)
            "ARE Brothers"
        else
            "NOT"
    )
}