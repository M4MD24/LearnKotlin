package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_l_string_functions

fun main() {
    val (
        textLength,
        countOfOperations
    ) = readln()
        .split(' ')
        .map { it.toShort() }
    val text = StringBuilder(readln())
    repeat(countOfOperations.toInt()) {
        val query = readln().split(' ')
        processQuery(
            text,
            query
        )
    }
}

private fun processQuery(
    text: StringBuilder,
    query: List<String>
) {
    val operator = query[0]
    when (operator) {
        "pop_back" -> popBack(text)

        "front" -> printFront(text)

        "back" -> printBack(text)

        "sort" -> sortSubstring(
            text,
            query[1].toShort(),
            query[2].toShort()
        )

        "reverse" -> reverseSubstring(
            text,
            query[1].toShort(),
            query[2].toShort()
        )

        "print" -> printCharacter(
            text,
            query[1].toShort()
        )

        "substr" -> printSubstring(
            text,
            query[1].toShort(),
            query[2].toShort()
        )

        "push_back" -> pushBack(
            text,
            query[1]
        )
    }
}

private fun popBack(text: StringBuilder) = text.setLength(text.length - 1)

private fun printFront(text: StringBuilder) = println(text.first())

private fun printBack(text: StringBuilder) = println(text.last())

private fun sortSubstring(
    text: StringBuilder,
    leftIndex: Short,
    rightIndex: Short
) {
    val sortedPart = text.substring(
        leftIndex - 1,
        rightIndex.toInt()
    )
        .toCharArray()
        .sorted()
        .joinToString("")
    text.replace(
        leftIndex - 1,
        rightIndex.toInt(),
        sortedPart
    )
}

private fun reverseSubstring(
    text: StringBuilder,
    leftIndex: Short,
    rightIndex: Short
) {
    val reversedPart = text.substring(
        leftIndex - 1,
        rightIndex.toInt()
    ).reversed()
    text.replace(
        leftIndex - 1,
        rightIndex.toInt(),
        reversedPart
    )
}

private fun printCharacter(
    text: StringBuilder,
    position: Short
) = println(text[position - 1])

private fun printSubstring(
    text: StringBuilder,
    leftIndex: Short,
    rightIndex: Short
) = println(text.substring(leftIndex - 1, rightIndex.toInt()))

private fun pushBack(
    text: StringBuilder,
    subText: String
) = text.append(subText)

// >
/*
private fun processQuery(
    text: StringBuilder,
    query: List<String>
) {
    val operator = query[0]
    when (query.size) {
        1 -> when (operator) {
            "pop_back" -> popBack(text)

            "front" -> println(front(text))

            "back" -> println(back(text))
        }

        2 -> {
            when (operator) {
                "print" -> {
                    val index = query[1].toInt()
                    println(
                        print(
                            text,
                            index
                        )
                    )
                }

                "push_back" -> {
                    val character = query[1][0]
                    pushBack(
                        text,
                        character
                    )
                }
            }
        }

        3 -> {
            val leftIndex = query[1].toInt()
            var rightIndex = query[2].toInt()
            if (
                text.length <= 1 ||
                leftIndex >= text.length
            )
                return
            else if (text.length < rightIndex)
                rightIndex = text.length
            when (operator) {
                "sort" -> sort(
                    text,
                    leftIndex - 1,
                    rightIndex
                )

                "reverse" -> reverse(
                    text,
                    leftIndex - 1,
                    rightIndex
                )

                "substr" -> println(
                    subString(
                        text,
                        leftIndex - 1,
                        rightIndex
                    )
                )
            }
        }
    }
}

private fun pushBack(
    text: StringBuilder,
    character: Char
) = text.append(character)

private fun print(
    text: StringBuilder,
    index: Int
) = if (text.isNotEmpty())
    text[index]
else
    ""

private fun subString(
    text: StringBuilder,
    leftIndex: Int,
    rightIndex: Int
) = if (text.isNotEmpty())
    text.substring(
        leftIndex,
        rightIndex
    )
else
    ""

private fun reverse(
    text: StringBuilder,
    leftIndex: Int,
    rightIndex: Int
) {
    val reversedSubText = text.substring(
        leftIndex,
        rightIndex
    ).reversed()
    text.replace(
        leftIndex,
        rightIndex,
        reversedSubText
    )
}

private fun sort(
    text: StringBuilder,
    leftIndex: Int,
    rightIndex: Int
) {
    val sortedPart = text.substring(
        leftIndex,
        rightIndex
    )
        .toCharArray()
        .sorted()
    var currentIndexOfSortedPart = 0
    for (index in leftIndex..<rightIndex)
        text[index] = sortedPart[currentIndexOfSortedPart++]
}

private fun back(text: StringBuilder): String {
    val textLength = text.length
    return if (textLength > 0)
        text[textLength - 1].toString()
    else
        ""
}

private fun front(text: StringBuilder): String {
    val textLength = text.length
    return if (textLength > 0)
        text[0].toString()
    else
        ""
}

private fun popBack(text: StringBuilder) {
    val textLength = text.length
    if (textLength > 1)
        text.setLength(textLength - 1)
}
*/