package _1_learn._1_3_object_oriented_programming._1_3_11_data_hiding

internal class Person {
    private var age: Int = 0 // data hiding

    fun setAge(age: Int) {
        this.age = age
    }

    fun getAge(): Int {
        return age
    }
}

fun main() {
    val PERSON = Person()
    PERSON.setAge(20)
    /* Error ! */
    // person.age = 30
    print("Person age: " + PERSON.getAge())
}