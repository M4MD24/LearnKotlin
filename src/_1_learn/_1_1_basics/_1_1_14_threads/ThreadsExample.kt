package _1_learn._1_1_basics._1_1_14_threads

fun main() {
    val thread = Thread {
        for (index in 1..5) {
            println("Thread running: $index")
            Thread.sleep(500)
        }
    }
    thread.start()
    thread.join()
}