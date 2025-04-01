package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_l_string_functions

import java.util.Arrays
import java.util.Scanner

private val input = Scanner(System.`in`)
private val length = input.nextShort()
private var countOfTestCases = input.nextShort()
private val nothing = input.nextLine()
private var originalText = input.next()
private var start: Short = 0
private var end: Short = 0

fun main() {
    while (countOfTestCases-- > 0) {
        val operation = input.next()
        when (operation) {
            "pop_back" -> originalText = originalText.substring(0, originalText.length - 1)
            "front" -> println(originalText[0])
            "back" -> println(originalText[originalText.length - 1])
            "sort" -> sortText()
            "reverse" -> reverseText()
            "print" -> println(originalText[input.nextShort() - 1])
            "substr" -> subStringText()
            "push_back" -> originalText += input.next()[0]
        }
    }
}

private fun sortText() {
    start = input.nextShort()
    end = input.nextShort()
    swapIfStartGreaterThanEnd()
    val characterText = originalText.toCharArray()
    Arrays.sort(characterText, (start - 1).toShort().toInt(), end.toInt())
    originalText = String(characterText)
}

private fun reverseText() {
    start = input.nextShort()
    end = input.nextShort()
    swapIfStartGreaterThanEnd()
    originalText = reverseSubstring((start - 1).toShort(), end)
}

private fun subStringText() {
    start = input.nextShort()
    end = input.nextShort()
    swapIfStartGreaterThanEnd()
    println(originalText.substring((start - 1).toShort().toInt(), end.toInt()))
}

private fun swapIfStartGreaterThanEnd() {
    if (end < start) {
        start = (start + end).toShort()
        end = (start - end).toShort()
        start = (start - end).toShort()
    }
}

fun reverseSubstring(
    startIndex: Short,
    endIndex: Short
): String {
    return originalText.substring(0, startIndex.toInt()) +
            StringBuilder(originalText.substring(startIndex.toInt(), endIndex.toInt())).reverse() +
            originalText.substring(endIndex.toInt())
}