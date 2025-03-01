package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_z_clean_code

val cleanCode = StringBuilder()

fun main() {
    inputValues()
    print(cleanCode)
}

private fun inputValues() {
    var countOfEmpty = 0
    var open = true
    while (true) {
        val line = readlnOrNull() ?: break
        if (line.isEmpty()) {
            countOfEmpty++
        } else {
            countOfEmpty = 0
            open = isOpen(line, open)
        }
        if (countOfEmpty == 2) break
    }
}

private fun isOpen(
    line: String,
    open: Boolean
): Boolean {
    var isOpen = open
    var lineAppended = false
    val length = line.length
    var index = 0
    while (index < length) {
        when {
            line[index] == '/' &&
                    index + 1 < length &&
                    line[index + 1] == '/' &&
                    isOpen -> break

            line[index] == '/' &&
                    index + 1 < length &&
                    line[index + 1] == '*' &&
                    isOpen -> {
                index++
                isOpen = false
            }

            line[index] == '*' &&
                    index + 1 < length &&
                    line[index + 1] == '/' &&
                    !isOpen -> {
                index++
                isOpen = true
            }

            isOpen -> {
                cleanCode.append(line[index])
                lineAppended = true
            }
        }
        index++
    }
    if (lineAppended && isOpen)
        cleanCode.append("\n")
    return isOpen
}