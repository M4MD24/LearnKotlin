package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_e_george_and_accommodation

fun main() {
    val roomCount = readln().toByte()
    var availableRooms = 0
    repeat(roomCount.toInt()) {
        val (
            currentOccupants,
            roomCapacity
        ) = readln()
            .split(' ')
            .map { it.toByte() }
        if (roomCapacity - currentOccupants >= 2)
            availableRooms++
    }
    print(availableRooms)
}