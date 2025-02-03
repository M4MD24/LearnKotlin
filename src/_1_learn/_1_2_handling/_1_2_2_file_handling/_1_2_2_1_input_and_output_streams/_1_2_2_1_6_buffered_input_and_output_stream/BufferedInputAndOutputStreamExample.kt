package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_1_input_and_output_streams._1_2_2_1_6_buffered_input_and_output_stream

import java.io.*

// • Methods of Buffered(Input/Output)Stream
/**
 * <h1>Methods of Buffered(Input/Output)Stream</h1>
 * <h2>Methods of BufferedInputStream</h2>
 *
 * The BufferedInputStream class provides implementations for different methods present in the InputStream class.
 *
 *  * **read()**
 *
 *  * **read()** - reads a single byte from the input stream
 *  * **read(byte[] arr)** - reads bytes from the stream and stores in the specified array
 *  * read(byte[] arr, int start, int length) - reads the number of bytes equal to the length from the stream and stores in the specified array starting from the position start
 *
 *
 *  * **available()** - To get the number of available bytes in the input stream, we can use the available() method.
 *  * **skip()** - To discard and skip the specified number of bytes, we can use the skip() method.
 *  * **close()** - To close the buffered input stream, we can use the close() method. Once the close() method is called, we cannot use the input stream to read the data.
 *  * **mark()** - mark the position in input stream up to which data has been read
 *  * **reset()** - returns the control to the point in the input stream where the mark was set
 *
 * <h2>Methods of BufferedOutputStream</h2>
 *
 * The BufferedOutputStream class provides implementations for different methods in the OutputStream class.
 *
 *  * **write()**
 *
 *  * **write()** - writes a single byte to the internal buffer of the output stream
 *  * **write(byte[] array)** - writes the bytes from the specified array to the output stream
 *  * **write(byte[] arr, int start, int length)** - writes the number of bytes equal to length to the output stream from an array starting from the position start
 *
 *
 *  * **flush()** - To clear the internal buffer, we can use the flush() method. This method forces the output stream to write all data present in the buffer to the destination file.
 *  * **close()** - To close the buffered output stream, we can use the close() method. Once the method is called, we cannot use the output stream to write the data.
 *
 */

fun main() {
    bufferedOutputStream()
    bufferedInputStream()
}

private fun bufferedInputStream() {
    val file = FileInputStream("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_1_input_and_output_streams/_1_2_2_1_6_buffered_input_and_output_stream/BufferedInputAndOutputStream.txt")
    val input = BufferedInputStream(file)

    var index = input.read()
    while (index != -1) {
        println(".read()     : " + index.toChar() + " = " + index)
        index = input.read()
    }

    println(".available(): ${input.available()}")

    input.close()
}

private fun bufferedOutputStream() {
    val data = "Buffered Input And Output Stream"
    val file = FileOutputStream("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_1_input_and_output_streams/_1_2_2_1_6_buffered_input_and_output_stream/BufferedInputAndOutputStream.txt")
    val output = BufferedOutputStream(file)
    val array = data.toByteArray()

    output.write(array)

    output.close()
}