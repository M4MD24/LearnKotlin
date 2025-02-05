package _1_learn._1_3_object_oriented_programming._1_3_12_interface

class LightRemote : Light {
    override fun turnOn() {
        println("Light is turned ON.")
    }

    override fun turnOff() {
        println("Light is turned OFF.")
    }
}