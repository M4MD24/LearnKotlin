package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_1_input_and_output_streams._1_2_2_1_7_print_stream

import java.io.PrintStream

// • Methods of PrintStream
/**
 * <h1>Methods of PrintStream</h1>
 *
 * The PrintStream class provides various methods that allow us to print data to the output.
 *
 *  * **print()**
 *
 *  * **print()** - prints the specified data to the output stream
 *  * **println()** - prints the data to the output stream along with a new line character at the end
 *
 *
 *  * **close()** - closes the print stream
 *  * **checkError()** - checks if there is an error in the stream and returns a boolean result
 *  * **append()** - appends the specified data to the stream
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
 */

fun main() {
    printStream()
}

private fun printStream() {
    val out = PrintStream("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_1_input_and_output_streams/_1_2_2_1_7_print_stream/PrintStream.txt")

    out.printf("%d\n%f\n%.2f\n%b\n%c\n%s", Int.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, true, 'a', "Input ")
    out.append("Stream")

    out.close()
}