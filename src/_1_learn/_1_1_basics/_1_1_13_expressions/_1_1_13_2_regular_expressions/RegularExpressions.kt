package _1_learn._1_1_basics._1_1_13_expressions._1_1_13_2_regular_expressions

import java.util.regex.Pattern

fun main() {
    regularExpressionWithSplit()

    regularExpressionsWithCaseInsensitive()
    regularExpressionsWithUnixLines()
    regularExpressionsWithUnicodeCase()
    regularExpressionsWithUnicodeCharacterClass()
    regularExpressionsWithMultiline()
    regularExpressionsWithLiteral()
    regularExpressionsWithDotAll()
    regularExpressionsWithComments()
    regularExpressionsWithCanonEQ()
}

private fun regularExpressionWithSplit() {
    val words = "One Two     Three\n\n\n\n\nFour\t\t\t\t\tFive Six Seven Eight Nine"

    val whiteSpaces = "\\s" // Matches any whitespace
    val sequenceWhiteSpace = "\\s+" // Matches a sequence of whitespace
    val zeroOrMoreWhiteSpace = "\\s*" // Matches zero or more whitespace
    val tabCharacter = "\\t" // Matches the Tab character
    val newLines = "\\n" // Matches Newline
    val wordBoundary = "\\b" // Matches a Word Boundary

    println("whiteSpaces = " + wordLengthAfterSplit(words, whiteSpaces))
    println("sequenceWhiteSpace = " + wordLengthAfterSplit(words, sequenceWhiteSpace))
    println("zeroOrMoreWhiteSpace = " + wordLengthAfterSplit(words, zeroOrMoreWhiteSpace))
    println("tabCharacter = " + wordLengthAfterSplit(words, tabCharacter))
    println("newLines = " + wordLengthAfterSplit(words, newLines))
    println("backSpaces = " + wordLengthAfterSplit(words, wordBoundary))

    println()
}

private fun wordLengthAfterSplit(word: String, splitRegex: String) = word.split(
    splitRegex.toRegex()
).dropLastWhile {
    it.isEmpty()
}.toTypedArray()
    .size

private fun regularExpressionsWithCaseInsensitive() {
    val pattern = Pattern.compile("Salam", Pattern.CASE_INSENSITIVE)
    val matcher = pattern.matcher("Salam\nSalam")
    print("Pattern.CASE_INSENSITIVE       : ")
    val matchFound = matcher.find()
    if (matchFound) println("Match found")
    else println("Match not found")
}

private fun regularExpressionsWithUnixLines() {
    val pattern = Pattern.compile("Salam", Pattern.UNIX_LINES)
    val matcher = pattern.matcher("Salam\nSalam")
    print("Pattern.UNIX_LINES             : ")
    val matchFound = matcher.find()
    if (matchFound) println("Match found")
    else println("Match not found")
}

private fun regularExpressionsWithUnicodeCase() {
    val pattern = Pattern.compile("Salam", Pattern.UNICODE_CASE)
    val matcher = pattern.matcher("Salam\nSalam")
    print("Pattern.UNICODE_CASE           : ")
    val matchFound = matcher.find()
    if (matchFound) println("Match found")
    else println("Match not found")
}

private fun regularExpressionsWithUnicodeCharacterClass() {
    val pattern = Pattern.compile("Salam", Pattern.UNICODE_CHARACTER_CLASS)
    val matcher = pattern.matcher("Salam\nSalam")
    print("Pattern.UNICODE_CHARACTER_CLASS: ")
    val matchFound = matcher.find()
    if (matchFound) println("Match found")
    else println("Match not found")
}

private fun regularExpressionsWithMultiline() {
    val pattern = Pattern.compile("Salam", Pattern.MULTILINE)
    val matcher = pattern.matcher("Salam\nSalam")
    print("Pattern.MULTILINE              : ")
    val matchFound = matcher.find()
    if (matchFound) println("Match found")
    else println("Match not found")
}

private fun regularExpressionsWithLiteral() {
    val pattern = Pattern.compile("Salam", Pattern.LITERAL)
    val matcher = pattern.matcher("Salam\nSalam")
    print("Pattern.LITERAL                : ")
    val matchFound = matcher.find()
    if (matchFound) println("Match found")
    else println("Match not found")
}

private fun regularExpressionsWithDotAll() {
    val pattern = Pattern.compile("Salam", Pattern.DOTALL)
    val matcher = pattern.matcher("Salam\nSalam")
    print("Pattern.DOTALL                 : ")
    val matchFound = matcher.find()
    if (matchFound) println("Match found")
    else println("Match not found")
}

private fun regularExpressionsWithComments() {
    val pattern = Pattern.compile("Salam", Pattern.COMMENTS)
    val matcher = pattern.matcher("Salam\nSalam")
    print("Pattern.COMMENTS               : ")
    val matchFound = matcher.find()
    if (matchFound) println("Match found")
    else println("Match not found")
}

private fun regularExpressionsWithCanonEQ() {
    val pattern = Pattern.compile("Salam", Pattern.CANON_EQ)
    val matcher = pattern.matcher("Salam\nSalam")
    print("Pattern.CANON_EQ               : ")
    val matchFound = matcher.find()
    if (matchFound) print("Match found")
    else print("Match not found")
}