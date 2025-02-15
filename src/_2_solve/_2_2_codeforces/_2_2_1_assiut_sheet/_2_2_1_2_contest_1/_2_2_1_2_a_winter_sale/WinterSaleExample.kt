package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_2_contest_1._2_2_1_2_a_winter_sale

fun main() {
    val line = readln().split(' ')
    val discount = line[0].toInt() * 0.01F
    val priceAfterDiscount: Float = line[1].toInt().toFloat()
    val priceBeforeDiscount: Float = priceAfterDiscount / (1 - discount)
    print("%.2f".format(priceBeforeDiscount))
}