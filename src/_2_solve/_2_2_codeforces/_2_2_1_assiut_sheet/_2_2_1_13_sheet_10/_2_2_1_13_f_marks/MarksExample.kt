package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_f_marks

fun main() {
    val (
        studentCount,
        subjectCount
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val marks = List(studentCount.toInt()) { readln() }
    print(
        (0..<studentCount)
            .count { studentIndex ->
                (0..<subjectCount)
                    .any { subjectIndex ->
                        marks[studentIndex][subjectIndex] == marks.maxOf { it[subjectIndex] }
                    }
            }
    )
}