package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_1_input_and_output_streams._1_2_2_1_3_file_input_and_output_stream

import java.io.FileInputStream
import java.io.FileOutputStream

// • Methods of File(Input/Output)Stream

/**
 * <h1>Methods of File(Input/Output)Stream</h1>
 * <h1>Methods of FileInputStream</h1>
 *
 * The FileInputStream class provides implementations for different methods present in the InputStream class.
 *
 *  * **read()**
 *
 *  * **read()** - reads a single byte from the file
 *  * **read(byte[] array)** - reads the bytes from the file and stores in the specified array
 *  * **read(byte[] array, int start, int length)** - reads the number of bytes equal to length from the file and stores in the specified array starting from the position start
 *
 *
 *  * **available()** - To get the number of available bytes, we can use the available() method.
 *  * **skip()** - To discard and skip the specified number of bytes, we can use the skip() method.
 *  * **close()** - To close the file input stream, we can use the close() method. Once the close() method is called, we cannot use the input stream to read data.
 *  * **finalize()** - ensures that the close() method is called
 *  * **getChannel()** - returns the object of FileChannel associated with the input stream
 *  * **getFD()** - returns the file descriptor associated with the input stream
 *  * **mark()** - mark the position in input stream up to which data has been read
 *  * **reset()** - returns the control to the point in the input stream where the mark was set
 *
 * <h2>Methods of FileOutputStream</h2>
 *
 * The FileOutputStream class provides implementations for different methods present in the OutputStream class.
 *
 *  * **write()**
 *
 *  * **write()** - writes the single byte to the file output stream
 *  * **write(byte[] array)** - writes the bytes from the specified array to the output stream
 *  * **write(byte[] array, int start, int length)** - writes the number of bytes equal to length to the output stream from an array starting from the position start
 *
 *
 *  * **flush()** - To clear the output stream, we can use the flush() method. This method forces the output stream to write all data to the destination.
 *  * **close()** - To close the file output stream, we can use the close() method. Once the method is called, we cannot use the methods of FileOutputStream.
 *  * **finalize()** - ensures that the close() method is called
 *  * **getChannel()** - returns the object of FileChannel associated with the output stream
 *  * **getFD()** - returns the file descriptor associated with the output stream
 *
 */

fun main() {
    fileOutputStream()
    fileInputStream()
}

private fun fileInputStream() {
    val file = FileInputStream("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_1_input_and_output_streams/_1_2_2_1_3_file_input_and_output_stream/FileInputAndOutputStream.txt")

    var index = file.read()
    var counter: Byte = 0

    while (index != -1) {
        println(".read()      : " + ++counter + " = " + index)
        index = file.read()
    }

    println(".available() : ${file.available()}")

    println(".skip()      : ${file.skip(10L)}")

    println(".getChannel(): ${file.channel}")

    println(".getFD()     : ${file.fd}")

    file.close()
}

private fun fileOutputStream() {
    val data = "File Input And Output Stream"

    val file = FileOutputStream("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_1_input_and_output_streams/_1_2_2_1_3_file_input_and_output_stream/FileInputAndOutputStream.txt")
    val dataBytes = data.toByteArray()

    file.write(dataBytes)

    file.flush()

    file.close()
}