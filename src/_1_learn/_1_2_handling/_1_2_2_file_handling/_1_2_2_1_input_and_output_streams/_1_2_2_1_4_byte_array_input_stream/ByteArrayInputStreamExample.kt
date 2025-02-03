package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_1_input_and_output_streams._1_2_2_1_4_byte_array_input_stream

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream

// • Methods of ByteArray(Input/Output)Stream
/**
 * <h1>Methods of ByteArray(Input/Output)Stream</h1>
 * <h2>Methods of ByteArrayInputStream</h2>
 *
 * The ByteArrayInputStream class provides implementations for different methods present in the InputStream class.
 *
 *  * **read()**
 *
 *  * **read()** - reads the single byte from the array present in the input stream
 *  * **read(byte[] array)** - reads bytes from the input stream and stores in the specified array
 *  * **read(byte[] array, int start, int length)** - reads the number of bytes equal to length from the stream and stores in the specified array starting from the position start
 *
 *
 *  * **available()** - To get the number of available bytes in the input stream, we can use the available() method.
 *  * **skip()** - To discard and skip the specified number of bytes, we can use the skip() method.
 *  * **close()** - To close the input stream, we can use the close() method.
 *  * **finalize()** - ensures that the close() method is called
 *  * **mark()** - marks the position in input stream up to which data has been read
 *  * **reset()** - returns the control to the point in the input stream where the mark was set
 *  * **markSupported()** - checks if the input stream supports mark() and reset()
 *
 * <h2>Methods of ByteArrayOutputStream</h2>
 *
 * The ByteArrayOutputStream class provides the implementation of the different methods present in the OutputStream class.
 *
 *  * **write()**
 *
 *  * **write(int byte)** - writes the specified byte to the output stream
 *  * **write(byte[] array)** - writes the bytes from the specified array to the output stream
 *  * **write(byte[] arr, int start, int length)** - writes the number of bytes equal to length to the output stream from an array starting from the position start
 *  * **writeTo(ByteArrayOutputStream out1)** - writes the entire data of the current output stream to the specified output stream
 *
 *
 *  * **toByteArray()** - returns the array present inside the output stream
 *  * **toString()** - returns the entire data of the output stream in string form
 *  * **close()** - To close the output stream, we can use the close() method.
 *  * **size()** - returns the size of the array in the output stream
 *  * **flush()** - clears the output stream
 *
 */
fun main() {
    byteArrayOutputStream()
    byteArrayInputStream()
}

private fun byteArrayInputStream() {
    val array = byteArrayOf(1, 2, 3, 4, 5, 6)
    val input = ByteArrayInputStream(array)
    for (index in array.indices) {
        val data = input.read()
        print("$data ")
    }
    input.close()
}

private fun byteArrayOutputStream() {
    val out = ByteArrayOutputStream()
    val data = "Byte Array Input And Output Stream"
    val array = data.toByteArray()

    out.write(array)

    println(".write()      : $out")
    println(".toByteArray(): " + out.toByteArray().contentToString())
    println(".toString()   : $out")
    println(".size()       : " + out.size())

    out.flush()

    out.close()
}