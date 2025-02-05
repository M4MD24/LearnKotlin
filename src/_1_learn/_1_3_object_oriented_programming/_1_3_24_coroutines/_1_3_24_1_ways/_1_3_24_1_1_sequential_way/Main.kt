package _1_learn._1_3_object_oriented_programming._1_3_24_coroutines._1_3_24_1_ways._1_3_24_1_1_sequential_way

fun main() {
    task1()
    print(" ")
    task2()
}

fun task2() {
    println("World")
    print("Task 2 - " + Thread.currentThread().name)
}

fun task1() {
    println("Task 1 - " + Thread.currentThread().name)
    print("Hello")
}