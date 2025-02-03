package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_2_reader_and_writer._1_2_2_2_5_string_reader_and_writer

import java.io.StringReader
import java.io.StringWriter

// • Methods of String(Reader/Writer)

/**
 * <h1>Methods of String(Reader/Writer)</h1>
 * <h2>Methods of StringReader</h2>
 *
 * The StringReader class provides implementations for different methods present in the Reader class.
 *
 *  * **read()**
 *
 *  * **read()** - reads a single character from the string reader
 *  * **read(char[] array)** - reads the characters from the reader and stores in the specified array
 *  * **read(char[] array, int start, int length)** - reads the number of characters equal to length from the reader and stores in the specified array starting from the position start
 *
 *
 *  * **skip()** - To discard and skip the specified number of characters, we can use the skip() method.
 *  * **close()** - To close the string reader, we can use the close() method. Once the close() method is called, we cannot use the reader to read data from the string.
 *  * **ready()** - checks if the string reader is ready to be read
 *  * **mark()** - marks the position in reader up to which data has been read
 *  * **reset()** - returns the control to the point in the reader where the mark was set
 *
 * <h2>Methods of StringWriter</h2>
 *
 * The StringWriter class provides implementations for different methods present in the Writer class.
 *
 *  * **write()**
 *
 *  * **write()** - writes a single character to the string writer
 *  * **write(char[] array)** - writes the characters from the specified array to the writer
 *  * **write(String data)** - writes the specified string to the writer
 *
 *
 *  * **getBuffer()** - returns the data present in the string buffer
 *  * **toString()** - returns the data present in the string buffer as a string
 *  * **close()** - To close the string writer, we can use the close() method.
 *  * **flush()** - forces to write all the data present in the writer to the string buffer
 *  * **append()** - inserts the specified character to the current writer
 *
 */

fun main() {
    stringWriter()
    stringReader()
}

private fun stringReader() {
    val data = "String Reader And Writer"
    val array = CharArray(Character.MAX_VALUE.code)
    val input = StringReader(data)

    input.read(array)
    print(".read()     : ")
    print(array)

    input.close()
}

private fun stringWriter() {
    val data = "String Reader And Writer"
    val out = StringWriter()

    out.write(data)

    println(".getBuffer(): " + out.buffer)

    out.close()
}