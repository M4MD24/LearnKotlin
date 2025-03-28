package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_w_hussien_and_arrays_2

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import java.util.Vector

private var countOfNumbers = 0
private var numbers = intArrayOf()

fun main() {
    val output = BufferedWriter(OutputStreamWriter(System.out))
    inputValues()
    output.write(getMaximumDifferenceBetweenPair().toString())
    output.flush()
}

private fun getMaximumDifferenceBetweenPair(): Int {
    val differenceBetweenPairIndices = IntArray(countOfNumbers)
    val greaterValuesIndices: Vector<Int> = Vector()
    var round = countOfNumbers - 1
    greaterValuesIndices.add(round)
    differenceBetweenPairIndices[round] = round
    while (round >= 0) {
        if (numbers[round] > numbers[greaterValuesIndices.lastElement()]) {
            greaterValuesIndices.add(round)
            differenceBetweenPairIndices[round] = round
        } else {
            var isGreaterValueFound = false
            for (index in greaterValuesIndices.indices.reversed())
                if (numbers[round] > numbers[greaterValuesIndices[index]]) {
                    differenceBetweenPairIndices[round] = greaterValuesIndices[index + 1]
                    isGreaterValueFound = true
                    break
                }
            if (!isGreaterValueFound)
                differenceBetweenPairIndices[round] = greaterValuesIndices.firstElement()
        }
        round--
    }
    var maximumDifferenceBetweenPair = differenceBetweenPairIndices[0]
    for (index in 1..<countOfNumbers)
        maximumDifferenceBetweenPair = maxOf(
            maximumDifferenceBetweenPair,
            differenceBetweenPairIndices[index] - index
        )
    return maximumDifferenceBetweenPair
}

private fun inputValues() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    countOfNumbers = input.readLine().toInt()
    numbers = IntArray(countOfNumbers)
    val line = StringTokenizer(input.readLine())
    for (index in 0..<countOfNumbers)
        numbers[index] = line.nextToken().toInt()
}