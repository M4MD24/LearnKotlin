package _1_learn._1_2_handling._1_2_1_exception_handling._1_2_1_1_try_and_catch_and_finally_and_throw_and_throws

import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.IOException

/* ■ Exception Types Table */ /* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * |  Exception Types   |  Description                                                                                                                                                                                                                                                                                                      |
 * ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * |  RuntimeException  |  A runtime exception is a representation of a programming error. These occur from inappropriate use of a piece of code. For example, NullPointerException is a runtime exception that occurs when a piece of code tries to execute some code on a variable that hasn't been assigned an object and points to null |
 * |  IOException       |  This exception is typically a way to say that something on                                                                                                                                                                                                                                                       |
 * ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * */

fun main() {
    try {
        divideByZero()
    } catch (e: ArithmeticException) {
        println("Exception in main: " + e.message)
    }

    try {
        findFile()
    } catch (e: IOException) {
        println("Exception in main: " + e.message)
    }
}

fun divideByZero() {
    var divideByZero = 0
    try {
        divideByZero = 5 / 0
        println("try")
    } catch (e: ArithmeticException) {
        throw ArithmeticException("Trying to divide by 0")
    } finally {
        println(divideByZero)
    }
}

@Throws(IOException::class)
fun findFile() {
    try {
        fetchPathFile()
    } catch (e: FileNotFoundException) {
        throw IOException("Unable to read file")
    }
}

@Throws(IOException::class)
fun fetchPathFile() {
    val newFile = File("src\\_1_learn\\_1_2_handling\\_1_2_1_exception_handling\\_1_2_1_1_try_and_catch_and_finally_and_throw_and_throws\\example.txt")
    FileInputStream(newFile).use { println("File found and opened successfully.") }
}