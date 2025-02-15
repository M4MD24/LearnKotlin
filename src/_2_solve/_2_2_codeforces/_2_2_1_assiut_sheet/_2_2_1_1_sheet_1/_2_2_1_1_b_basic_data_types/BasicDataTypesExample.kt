package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_b_basic_data_types

private var intVariable = 0
private var longVariable = 0L
private var charVariable = ' '
private var floatVariable = 0F
private var doubleVariable = 0.0

fun main() {
    inputValues()
    displayValues()
}

private fun inputValues() {
    val line = readln().split(' ')
    intVariable = line[0].toInt()
    longVariable = line[1].toLong()
    charVariable = line[2][0]
    floatVariable = line[3].toFloat()
    doubleVariable = line[4].toDouble()
}

private fun displayValues() {
    println(intVariable)
    println(longVariable)
    println(charVariable)
    println(floatVariable)
    print(doubleVariable)
}