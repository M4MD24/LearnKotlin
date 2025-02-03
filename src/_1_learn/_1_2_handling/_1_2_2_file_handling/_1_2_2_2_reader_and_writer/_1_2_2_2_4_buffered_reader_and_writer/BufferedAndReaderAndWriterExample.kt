package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_2_reader_and_writer._1_2_2_2_4_buffered_reader_and_writer

import java.io.*

// • Methods of Buffered(Reader/Writer)

/**
 * <h1>Methods of Buffered(Reader/Writer)</h1>
 * <h2>Methods of BufferedReader</h2>
 *
 * The BufferedReader class provides implementations for different methods present in Reader.
 *
 *  * **read()**
 *
 *  * **read()** - reads a single character from the internal buffer of the reader
 *  * **read(char[] array)** - reads the characters from the reader and stores in the specified array
 *  * **read(char[] array, int start, int length)** - reads the number of characters equal to length from the reader and stores in the specified array starting from the position start
 *
 *
 *  * **skip()** - To discard and skip the specified number of characters.
 *  * **close()** - To close the buffered reader, we can use the close() method. Once the close() method is called, we cannot use the reader to read the data.
 *  * **ready()** - checks if the file reader is ready to be read
 *  * **mark()** - mark the position in reader up to which data has been read
 *  * **reset()** - returns the control to the point in the reader where the mark was set
 *
 * <h2>Methods of BufferedWriter</h2>
 *
 * The BufferedWriter class provides implementations for different methods present in Writer.
 *
 *  * **write()**
 *
 *  * **write()** - writes a single character to the internal buffer of the writer
 *  * **write(char[] array)** - writes the characters from the specified array to the writer
 *  * **write(String data)** - writes the specified string to the writer
 *
 *
 *  * **close()** - To close the buffered writer, we can use the close() method. Once the close() method is called, we cannot use the writer to write the data.
 *  * **newLine()** - inserts a new line to the writer
 *  * **append()** - inserts the specified character to the current writer
 *
 */

fun main() {
    bufferedWriter()
    bufferedReader()
}

private fun bufferedReader() {
    val array = CharArray(Character.MAX_VALUE.code)
    val file = FileReader("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_2_reader_and_writer/_1_2_2_2_4_buffered_reader_and_writer/BufferedReaderAndWriter.txt")
    val input = BufferedReader(file)

    println(".ready(): " + file.ready())

    input.read(array)
    print(".read() : ")
    print(array)

    input.close()
}

private fun bufferedWriter() {
    val data = "Buffered Reader And Writer"
    val file = FileWriter("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_2_reader_and_writer/_1_2_2_2_4_buffered_reader_and_writer/BufferedReaderAndWriter.txt")
    val out = BufferedWriter(file)

    out.write(data)
    out.newLine()

    out.close()
}