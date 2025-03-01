package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_y_minimum_cost_string

import kotlin.math.abs

private val text = StringBuilder(readln())
private var length = text.length
private const val COUNT_OF_ENGLISH_LETTERS = 26
private val numbers = IntArray(COUNT_OF_ENGLISH_LETTERS)

fun main() {
    inputNumbers()
    printMinimumCost()
}

private fun printMinimumCost() {
    var round = 0
    while (round < length) {
        var questionMarkCounter = 0
        if (text[round] == '?') {
            for (index in round..<length)
                if (text[index] == '?')
                    questionMarkCounter++
                else
                    break
            if (questionMarkCounter == length) {
                println("0\n" + "a".repeat(questionMarkCounter))
                return
            } else {
                var minimumCost: Int
                var numberIndex = 0
                when {
                    round == 0 -> {
                        minimumCost = getCost(
                            getNumberFromCharacter(questionMarkCounter),
                            numbers[0]
                        )
                        for (index in 1..<(text[questionMarkCounter] - 'a' + 1)) {
                            val currentCost = getCost(
                                getNumberFromCharacter(questionMarkCounter),
                                numbers[index]
                            )
                            if (currentCost < minimumCost) {
                                minimumCost = currentCost
                                numberIndex = index
                            }
                        }
                        for (index in 0..<questionMarkCounter)
                            setCharacterForText(
                                index,
                                numberIndex
                            )
                        round += questionMarkCounter
                    }

                    round + questionMarkCounter == length -> {
                        minimumCost = getCost(
                            getNumberFromCharacter(round - 1),
                            numbers[0]
                        )
                        for (index in 1..<(text[round - 1] - 'a' + 1)) {
                            val currentCost = getCost(
                                getNumberFromCharacter(round - 1),
                                numbers[index]
                            )
                            if (currentCost < minimumCost) {
                                minimumCost = currentCost
                                numberIndex = index
                            }
                        }
                        for (index in round..<length)
                            setCharacterForText(
                                index,
                                numberIndex
                            )
                        break
                    }

                    else -> {
                        minimumCost = getCost(
                            getNumberFromCharacter(round - 1),
                            numbers[0]
                        ) + abs(numbers[0] - getNumberFromCharacter(round + questionMarkCounter))
                        for (index in 1..<COUNT_OF_ENGLISH_LETTERS) {
                            val currentCost = getCost(
                                getNumberFromCharacter(round - 1),
                                numbers[index]
                            ) + getCost(
                                numbers[index],
                                getNumberFromCharacter(round + questionMarkCounter)
                            )
                            if (currentCost < minimumCost) {
                                minimumCost = currentCost
                                numberIndex = index
                            }
                        }
                        for (index in round..<round + questionMarkCounter)
                            setCharacterForText(
                                index,
                                numberIndex
                            )
                        round += questionMarkCounter
                    }
                }
            }
        }
        round++
    }
    var finalCost = 0L
    for (index in 0..<length - 1)
        finalCost += getCost(
            getNumberFromCharacter(index),
            getNumberFromCharacter(index + 1)
        )
    print("$finalCost\n$text")
}

private fun setCharacterForText(
    index: Int,
    numberIndex: Int
) = text.setCharAt(index, (numberIndex + 'a'.code).toChar())

private fun getCost(
    firstNumber: Int,
    secondNumber: Int
) = abs(firstNumber - secondNumber)

private fun getNumberFromCharacter(index: Int) = numbers[text[index] - 'a']

private fun inputNumbers() {
    val costStrings = readln().split(' ')
    for (index in 0..<COUNT_OF_ENGLISH_LETTERS)
        numbers[index] = costStrings[index].toInt()
}