package _1_learn._1_3_object_oriented_programming._1_3_24_coroutines._1_3_24_1_ways._1_3_24_1_2_coroutine_way_and_suspend

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch { task1() }
    task2()
    Thread.sleep(2000L)
}

fun task2() {
    println("Task 2 - " + Thread.currentThread().name)
    print("Hello")
}

suspend fun task1() {
    delay(1000L)
    println(" World")
    print("Task 1 - " + Thread.currentThread().name)
}
