package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_1_input_and_output_streams._1_2_2_1_5_object_input_and_output_stream

import java.io.*

// • Methods Object(Input/Output)Stream
/**
 * <h1>Methods of Object(Input/Output)Stream</h1>
 * <h2>Methods of ObjectInputStream</h2>
 *
 * The ObjectInputStream class provides implementations of different methods present in the InputStream class.
 *
 *  * **read()**
 *
 *  * **read()** - reads a byte of data from the input stream
 *  * **readBoolean()** - reads data in boolean form
 *  * **readChar()** - reads data in character form
 *  * **readInt()** - reads data in integer form
 *  * **readObject()** - reads the object from the input stream
 *
 *
 *  * **available()** - returns the available number of bytes in the input stream
 *  * **mark()** - marks the position in input stream up to which data has been read
 *  * **reset()** - returns the control to the point in the input stream where the mark was set
 *  * **skipBytes()** - skips and discards the specified bytes from the input stream
 *  * **close()** - closes the object input stream
 *
 * <h2>Methods of ObjectOutputStream</h2>
 *
 * The ObjectOutputStream class provides implementations for different methods present in the OutputStream class.
 *
 *  * **write()**
 *
 *  * **write()** - writes a byte of data to the output stream
 *  * **writeBoolean()** - writes data in boolean form
 *  * **writeChar()** - writes data in character form
 *  * **writeInt()** - writes data in integer form
 *  * **writeObject()** - writes object to the output stream
 *
 *
 *  * **flush()** - clears all the data from the output stream
 *  * **drain()** - puts all the buffered data in the output stream
 *  * **close()** - closes the output stream
 *
 */

fun main() {
    objectOutputStream()
    objectInputStream()
}

private fun objectInputStream() {
    val fileStream = FileInputStream("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_1_input_and_output_streams/_1_2_2_1_5_object_input_and_output_stream/ObjectInputAndOutputStream.txt")
    val objStream = ObjectInputStream(fileStream)

    println("Integer data: " + objStream.readInt())
    println("String data: " + objStream.readObject())
    println("Boolean data: " + objStream.readBoolean())
    print("Char data: " + objStream.readChar())

    objStream.close()
}

private fun objectOutputStream() {
    val intData = 5
    val stringData = "Object Input And Output Stream"
    val booleanData = true
    val charData = 'A'

    val file = FileOutputStream("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_1_input_and_output_streams/_1_2_2_1_5_object_input_and_output_stream/ObjectInputAndOutputStream.txt")
    val output = ObjectOutputStream(file)

    output.writeInt(intData)
    output.writeObject(stringData)
    output.writeBoolean(booleanData)
    output.writeChar(charData.code)

    output.close()
}