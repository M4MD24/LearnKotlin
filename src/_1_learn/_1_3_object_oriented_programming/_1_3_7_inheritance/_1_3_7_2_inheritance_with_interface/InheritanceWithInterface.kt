package _1_learn._1_3_object_oriented_programming._1_3_7_inheritance._1_3_7_2_inheritance_with_interface

interface Interface1 {
    fun function1()

    fun function2()

    fun function3()
}

interface Interface2 {
    fun function4()

    fun function5()

    fun function6()
}

open class AnotherClass : Interface1 {
    // Implementing Single Interface
    override fun function1() {
        println("Function 1")
    }

    override fun function2() {
        println("Function 2")
    }

    override fun function3() {
        println("Function 3")
    }
}

/* ~ The Difference Between (Class) and (Interface)
 *  You can't inherit multiple class, But Interface can
 * */
class InheritanceWithInterface : AnotherClass(), Interface1, Interface2 {
    // Implementing Class And Multiple Interfaces
    override fun function1() {
        super.function1()
        println("Another Function 1")
    }

    override fun function2() {
        super.function2()
        println("Another Function 2")
    }

    override fun function3() {
        super.function3()
        println("Another Function 3")
    }

    override fun function4() {
        println("Another Function 4")
    }

    override fun function5() {
        println("Another Function 5")
    }

    override fun function6() {
        println("Another Function 6")
    }
}

fun main() {
    InheritanceWithInterface().function1()
    InheritanceWithInterface().function2()
    InheritanceWithInterface().function3()
    InheritanceWithInterface().function4()
    InheritanceWithInterface().function5()
    InheritanceWithInterface().function6()
}