package _1_learn._1_3_object_oriented_programming._1_3_16_local_class

class Car {
    fun startEngine() {
        class Engine { // Local Class
            fun run() {
                print("Engine is running!")
            }
        }
        Engine().run()
    }
}

fun main() {
    Car().startEngine()
}