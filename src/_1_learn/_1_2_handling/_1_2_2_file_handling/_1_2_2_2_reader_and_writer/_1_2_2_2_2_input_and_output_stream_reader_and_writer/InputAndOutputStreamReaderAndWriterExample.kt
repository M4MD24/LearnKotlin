package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_2_reader_and_writer._1_2_2_2_2_input_and_output_stream_reader_and_writer

import java.io.*
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets

// • Methods of (Input/Output) Stream (Reader/Writer)

/**
 * <h1>Methods of (Input/Output)Stream(Reader/Writer)</h1>
 * <h2>Methods of InputStreamReader</h2>
 *
 * The InputStreamReader class provides implementations for different methods present in the Reader class.
 *
 *  * **read()**
 *
 *  * **read()** - reads a single character from the reader
 *  * **read(char[] array)** - reads the characters from the reader and stores in the specified array
 *  * **read(char[] array, int start, int length)** - reads the number of characters equal to length from the reader and stores in the specified array starting from the start
 *
 *
 *  * **getEncoding()** - The getEncoding() method can be used to get the type of encoding that is used to store data in the input stream.
 *  * **close()** - To close the input stream reader, we can use the close() method. Once the close() method is called, we cannot use the reader to read the data.
 *  * **ready()** - checks if the stream is ready to be read
 *  * **mark()** - mark the position in stream up to which data has been read
 *  * **reset()** - returns the control to the point in the stream where the mark was set
 *
 * <h2>Methods OutputStreamWriter</h2>
 *
 * The OutputStreamWriter class provides implementations for different methods present in the Writer class.
 *
 *  * **write()**
 *
 *  * **write()** - writes a single character to the writer
 *  * **write(char[] array)** - writes the characters from the specified array to the writer
 *  * **write(String data)** - writes the specified string to the writer
 *
 *
 *  * **getEncoding()** - The getEncoding() method can be used to get the type of encoding that is used to write data to the output stream.
 *  * **close()** - To close the output stream writer, we can use the close() method. Once the close() method is called, we cannot use the writer to write the data.
 *  * **flush()** - forces to write all the data present in the writer to the corresponding destination
 *  * **append()** - inserts the specified character to the current writer
 *
 */

fun main() {
    outputStreamWriter()
    inputStreamReader()
}

private fun inputStreamReader() {
    val array = CharArray(Character.MAX_VALUE.code)
    val file = FileInputStream("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_2_reader_and_writer/_1_2_2_2_2_input_and_output_stream_reader_and_writer/InputAndOutputStreamReaderAndWriter.txt")
    val input1 = InputStreamReader(file, StandardCharsets.US_ASCII)
    val input2 = InputStreamReader(file, Charset.forName("UTF-32"))

    input1.read(array)
    print(".read()              : ")
    println(array)

    println(".getEncoding() input1: " + input1.encoding)

    print(".getEncoding() input2: " + input2.encoding)

    input1.close()
}

private fun outputStreamWriter() {
    val data = "Input And Output Stream Reader And Writer"
    val file = FileOutputStream("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_2_reader_and_writer/_1_2_2_2_2_input_and_output_stream_reader_and_writer/InputAndOutputStreamReaderAndWriter.txt")
    val output = OutputStreamWriter(file)

    output.write(data)

    output.close()
}