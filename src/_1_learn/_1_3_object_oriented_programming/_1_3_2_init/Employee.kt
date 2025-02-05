package _1_learn._1_3_object_oriented_programming._1_3_2_init

class Employee(
    val id: Int,
    val name: String,
    val job: String
) {
    init {
        sayHello()
    }

    private fun sayHello() {
        println("$name: Hello!")
    }
}