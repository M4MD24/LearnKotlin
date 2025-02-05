package _1_learn._1_3_object_oriented_programming._1_3_21_keywords._1_3_21_1_abstract_and_override_and_super

/* abstract: abstract classes are created to be the superclass of other classes. And, if a class contains an abstract method, it is mandatory to override it! */
abstract class Persons {
    // Superclass
    open fun displayEmployeesDetails(name: String, age: Int) {
        println("Name: $name")
        println("Age: $age\n")
    }

    abstract fun displayManagersDetails()
}

class AbstractAndOverrideAndSuper : Persons() {
    // Subclass
    override fun displayEmployeesDetails(name: String, age: Int) {
        println("■ Display Employees Details")
        super.displayEmployeesDetails(name, age) /* super: used in subclasses to access superclass members (attributes, constructors and methods). */
    }

    override fun displayManagersDetails() {
        println("■ Display Managers Details\n")
    }
}

fun main() {
    val abstractAndOverrideAndSuper = AbstractAndOverrideAndSuper()
    abstractAndOverrideAndSuper.displayManagersDetails()
    abstractAndOverrideAndSuper.displayEmployeesDetails("Mohamed", 20)

    val persons: Persons = object : Persons() {
        override fun displayEmployeesDetails(name: String, age: Int) {
            println("■ Display Employees Details2")
            super.displayEmployeesDetails(name, age)
        }

        override fun displayManagersDetails() {
            println("■ Display Managers Details2\n")
        }
    }
    persons.displayManagersDetails()
    persons.displayEmployeesDetails("Ahmed", 18)
}
