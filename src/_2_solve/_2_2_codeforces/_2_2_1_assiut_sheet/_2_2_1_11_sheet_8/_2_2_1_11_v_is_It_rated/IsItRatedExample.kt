package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_v_is_It_rated

fun main() {
    val participantCount = readln().toShort()
    val ratings = List(participantCount.toInt()) {
        readln()
            .split(' ')
            .map { it.toShort() }
    }
    for ((before, after) in ratings)
        if (before != after) {
            print("rated")
            return
        }
    for (index in 0..<participantCount - 1)
        if (ratings[index][0] < ratings[index + 1][0]) {
            print("unrated")
            return
        }
    print("maybe")
}