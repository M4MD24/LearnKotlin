package _1_learn._1_3_object_oriented_programming._1_3_24_coroutines._1_3_24_2_functions._1_3_24_2_3_with_context

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() = runBlocking {
    sixSeconds()
}

private fun sixSeconds() = runBlocking {
    val numberOne = withContext(Dispatchers.Default) {
        delay(2000L)
        1
    }
    val numberTwo = withContext(Dispatchers.Default) {
        delay(2000L)
        2
    }
    val numberThree = withContext(Dispatchers.Default) {
        delay(2000L)
        3
    }
    print(
        numberOne +
                numberTwo +
                numberThree
    )
}