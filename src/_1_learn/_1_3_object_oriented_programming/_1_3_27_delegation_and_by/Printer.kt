package _1_learn._1_3_object_oriented_programming._1_3_27_delegation_and_by

interface Printer {
    fun printMessage(message: String)
}

class ConsolePrinter : Printer {
    override fun printMessage(message: String) = print("Message: $message")
}

// A class using delegation
class UserPrinter(printer: Printer) : Printer by printer

fun main() {
    val printer = ConsolePrinter()
    val userPrinter = UserPrinter(printer)

    userPrinter.printMessage("Hello from delegated printing!")
}