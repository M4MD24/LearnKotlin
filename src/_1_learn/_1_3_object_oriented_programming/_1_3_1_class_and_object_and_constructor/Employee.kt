package _1_learn._1_3_object_oriented_programming._1_3_1_class_and_object_and_constructor

// Class
class Employee(
    /* This is Constructor ! */
    val id: Int,
    val name: String,
    val job: String
) {
    fun sayHello() {
        println("$name: Hello!")
    }
}