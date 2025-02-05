package _1_learn._1_3_object_oriented_programming._1_3_24_coroutines._1_3_24_2_functions._1_3_24_2_2_async

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    sixSeconds()
    println()
    twoSeconds()
}

private fun twoSeconds() = runBlocking {
    val numberOne = async {
        delay(2000L)
        1
    }
    val numberTwo = async {
        delay(2000L)
        2
    }
    val numberThree = async {
        delay(2000L)
        3
    }
    print(
        numberOne.await() +
                numberTwo.await() +
                numberThree.await()
    )
}

private fun sixSeconds() = runBlocking {
    val numberOne = async {
        delay(2000L)
        1
    }.await()
    val numberTwo = async {
        delay(2000L)
        2
    }.await()
    val numberThree = async {
        delay(2000L)
        3
    }.await()
    print(numberOne + numberTwo + numberThree)
}