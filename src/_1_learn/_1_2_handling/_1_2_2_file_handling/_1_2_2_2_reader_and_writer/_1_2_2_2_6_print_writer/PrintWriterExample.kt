package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_2_reader_and_writer._1_2_2_2_6_print_writer

import java.io.PrintWriter

// • Methods of PrintWriter

/**
 * <h1>Methods of PrintWriter
 *
 *The PrintWriter class provides various methods that allow us to print data to the output.
 *
 *  * **print()**
 *
 *  * **print()** - prints the specified data to the writer
 *  * **println()** - prints the data to the writer along with a new line character at the end
 *
 *
 *  * **close()** - closes the print writer
 *  * **checkError()** - checks if there is an error in the writer and returns a boolean result
 *  * **append()** - appends the specified data to the writer
 *
 * <h2>String Formatting</h2>
 *
 *  * **%d** - seeks to format and print integers.
 *  * **%f** - Ninth for formatting and printing decimal numbers (floats and evens).
 *  * **%.2f** - to format and print a floating-point number with a minimum width of 0 characters and a precision of two digits after the decimal point.
 *  * **%b** - format specifier is used for formatting and printing boolean values.
 *  * **%s** - seeks to format and print texts (strings).
 *  * **%c** - for formatting and printing single characters.
 *
</h1> */

fun main() {
    printWriter()
}

private fun printWriter() {
    val data = "Print Writer"
    val out = PrintWriter("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_2_reader_and_writer/_1_2_2_2_6_print_writer/PrintWriter.txt")

    out.print(data)

    out.close()
}