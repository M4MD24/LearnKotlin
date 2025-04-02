package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_d_juicer

fun main() {
    val (
        orangeCount,
        maximumSize,
        wasteLimit
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val orangeSizes = readln()
        .split(' ')
        .map { it.toInt() }

    var currentWaste = 0
    var emptyOperations = 0

    for (size in orangeSizes)
        if (size <= maximumSize) {
            currentWaste += size
            if (currentWaste > wasteLimit) {
                emptyOperations++
                currentWaste = 0
            }
        }

    print(emptyOperations)
}