package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_4_contest_2._2_2_1_4_b_drawing_x

fun main() {
    val countOfLines: Byte = readln().toByte()
    printX(countOfLines)
}

fun printX(countOfLines: Byte) {
    for (row in 0..<countOfLines) {
        for (column in 0..<countOfLines)
            print(
                when {
                    row == column && row == countOfLines / 2 -> 'X'
                    row == column -> '\\'
                    row + column == countOfLines - 1 -> '/'
                    else -> '*'
                }
            )
        println()
    }
}

// >
/*
private const val SPACE = "*"
private const val LEFT_BRANCH = "\\"
private const val RIGHT_BRANCH = "/"
private const val MIDDLE = "X"
private fun printX(countOfLines: Byte) {
    if (countOfLines > 0) {
        if (countOfLines.toInt() == 1)
            print(MIDDLE)
        else if (countOfLines.toInt() == 2) {
            println(LEFT_BRANCH + RIGHT_BRANCH)
            print(RIGHT_BRANCH + LEFT_BRANCH)
        } else {
            if (isOdd(countOfLines)) {
                val middleCountOfLines: Byte = (countOfLines / 2).toByte()
                var startLength: Byte = 0
                var endLength: Byte = (countOfLines - 1).toByte()
                var round: Byte = 0
                while (round < countOfLines) {
                    var printLeftBranch = true
                    var printRightBranch = true
                    for (index in 0..<countOfLines) {
                        val printLeftBranchCondition = printLeftBranch &&
                                index.toByte() == startLength &&
                                index.toByte() != middleCountOfLines
                        val printMiddleCondition = printLeftBranch &&
                                printRightBranch &&
                                round == middleCountOfLines &&
                                index.toByte() == middleCountOfLines
                        val printRightBranchCondition = printRightBranch &&
                                index.toByte() == endLength &&
                                index.toByte() != middleCountOfLines
                        if (printLeftBranchCondition) {
                            print(LEFT_BRANCH)
                            printLeftBranch = false
                        }
                        if (printMiddleCondition) {
                            print(MIDDLE)
                            printLeftBranch = false
                            printRightBranch = false
                        }
                        if (printRightBranchCondition) {
                            print(RIGHT_BRANCH)
                            printRightBranch = false
                        }
                        if (
                            !printLeftBranchCondition &&
                            !printMiddleCondition &&
                            !printRightBranchCondition
                        )
                            print(SPACE)
                    }
                    if (round.toInt() != countOfLines - 1)
                        println()
                    round++
                    startLength++
                    endLength--
                }
            }
        }
    }
}

private fun isOdd(length: Byte) = length % 2 != 0*/
