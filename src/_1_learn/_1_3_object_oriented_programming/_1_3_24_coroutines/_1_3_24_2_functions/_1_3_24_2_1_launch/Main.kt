package _1_learn._1_3_object_oriented_programming._1_3_24_coroutines._1_3_24_2_functions._1_3_24_2_1_launch

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.io.File
import java.math.BigInteger

fun main(): Unit = runBlocking {
    println("Main Thread: ${Thread.currentThread().name}")

    launch(Dispatchers.Unconfined) {
        println("Before delay: Thread: ${Thread.currentThread().name}")
        delay(1000)
        println("After delay: Thread: ${Thread.currentThread().name}")
    }

    launch(Dispatchers.Default) {
        delay(1000)
        val factorial = computeFactorial(5_000)
        println("Thread: ${Thread.currentThread().name} - Factorial Length: ${factorial.toString().length}")
    }

    launch(Dispatchers.IO) {
        delay(1000)
        val lines = readLargeFile("src\\_1_learn\\_1_3_object_oriented_programming\\_1_3_24_coroutines\\_1_3_24_2_functions\\_1_3_24_2_1_launch\\data.txt")
        println("Thread: ${Thread.currentThread().name} - Read ${lines.size} lines")
    }
}

fun computeFactorial(number: Int): BigInteger {
    var result = BigInteger.ONE
    for (index in 1..number) {
        result = result.multiply(BigInteger.valueOf(index.toLong()))
    }
    return result
}

fun readLargeFile(filePath: String): List<String> {
    return File(filePath).readLines()
}
