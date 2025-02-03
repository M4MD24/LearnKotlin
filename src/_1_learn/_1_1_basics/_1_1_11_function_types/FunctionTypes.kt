package _1_learn._1_1_basics._1_1_11_function_types

abstract class AbstractClass {
    // Abstract function
    abstract fun abstractMethod()
}

class MethodsAndFunctionsTypes : AbstractClass() {
    // Instance function
    fun printInstanceMessage() {
        println("This is an instance function.")
    }

    // Return function
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    // Normal function
    fun printMessage() {
        println("This is a void function.")
    }

    // Parameterized function
    fun greet(name: String) {
        println("Hello, $name")
    }

    // Private function
    private fun privateMethod() {
        println("This is a private function.")
    }

    // Overloaded functions
    fun display(a: Int) {
        println("Integer: $a")
    }

    fun display(a: String) {
        println("String: $a")
    }

    // Abstract function implementation
    override fun abstractMethod() {
        println("This is an abstract function implementation.")
    }

    // Static function
    fun printStaticMessage() {
        println("This is a static function.")
    }
}