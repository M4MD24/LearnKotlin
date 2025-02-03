package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_1_input_and_output_streams._1_2_2_1_2_input_and_output_stream

import java.io.*

// • Methods of (Input/Output)Stream

/**
 * <h1>Methods of (Input/Output)Stream</h1>
 * <h2>Methods of InputStream</h2>
 *
 * The InputStream class provides different methods that are implemented by its subclasses.
 *
 *  * **read()** - reads one byte of data from the input stream
 *  * **read(byte[] array)** - reads bytes from the stream and stores in the specified array
 *  * **available()** - returns the number of bytes available in the input stream
 *  * **mark()** - marks the position in the input stream up to which data has been read
 *  * **reset()** - returns the control to the point in the stream where the mark was set
 *  * **markSupported()** - checks if the mark() and reset() method is supported in the stream
 *  * **skip()** - skips and discards the specified number of bytes from the input stream
 *  * **close()** - closes the input stream
 *
 * <h2>Methods of OutputStream</h2>
 *
 * The OutputStream class provides different methods that are implemented by its subclasses
 *
 *  * **write()** - writes the specified byte to the output stream
 *  * **write(byte[] array)** - writes the bytes from the specified array to the output stream
 *  * **flush()** - forces to write all data present in output stream to the destination
 *  * **close()** - closes the output stream
 *
 */

fun main() {
    outputStream()
    inputStream()
}

private fun inputStream() {
    val array = ByteArray(Byte.MAX_VALUE.toInt())
    val file: InputStream = FileInputStream("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_1_input_and_output_streams/_1_2_2_1_2_input_and_output_stream/InputAndOutputStream.txt")

    println(".available()    : " + file.available())

    println(".markSupported(): " + file.markSupported())

    println(".read()         : " + file.read())

    print("Input Stream    : ")
    file.read(array)
    val data = String(array)
    println(data)

    println(".skip()         : " + file.skip(5))

    if (file.markSupported()) {
        file.mark(40)
        println(".mark()         : ")

        println(".reset()        : ")
        file.reset()
    } else println("Mark/reset not supported in this stream.")

    file.close()
}

private fun outputStream() {
    val data = "Input And Output Stream"

    val file: OutputStream = FileOutputStream("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_1_input_and_output_streams/_1_2_2_1_2_input_and_output_stream/InputAndOutputStream.txt")
    val dataBytes = data.toByteArray()

    file.write(dataBytes)

    file.flush()

    file.close()
}