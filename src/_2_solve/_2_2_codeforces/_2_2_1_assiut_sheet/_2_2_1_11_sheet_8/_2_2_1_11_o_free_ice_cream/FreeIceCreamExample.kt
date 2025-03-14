package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_o_free_ice_cream

fun main() {
    val (
        countOfPeople,
        initialIceCream
    ) = readln()
        .split(' ')
        .map { it.toLong() }
    var availableIceCream = initialIceCream
    var distressedCount = 0
    repeat(countOfPeople.toInt()) {
        val currentLine = readln().split(' ')
        val operation = currentLine[0][0]
        val amount = currentLine[1].toLong()
        when (operation) {
            '+' -> availableIceCream += amount
            '-' -> if (availableIceCream >= amount)
                availableIceCream -= amount
            else
                distressedCount++
        }
    }
    print("$availableIceCream $distressedCount")
}