package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_2_reader_and_writer._1_2_2_2_1_reader_and_writer

import java.io.*

// • Methods of (Reader/Writer)

/**
 * <h1>Methods of (Reader/Writer)</h1>
 * <h2>Methods of Reader</h2>
 *
 * The Reader class provides different methods that are implemented by its subclasses. Here are some of the commonly used methods:
 *
 *  * **ready()** - checks if the reader is ready to be read
 *  * **read(char[] array)** - reads the characters from the stream and stores in the specified array
 *  * **read(char[] array, int start, int length)** - reads the number of characters equal to length from the stream and stores in the specified array starting from the start
 *  * **mark()** - marks the position in the stream up to which data has been read
 *  * **reset()** - returns the control to the point in the stream where the mark is set
 *  * **skip()** - discards the specified number of characters from the stream
 *
 * <h2>Methods of Writer</h2>
 *
 * The Writer class provides different methods that are implemented by its subclasses.
 *
 *  * **write(char[] array)** - writes the characters from the specified array to the output stream
 *  * **write(String data)** - writes the specified string to the writer
 *  * **append(char c)** - inserts the specified character to the current writer
 *  * **flush()** - forces to write all the data present in the writer to the corresponding destination
 *  * **close()** - closes the writer
 *
 */

fun main() {
    writer()
    reader()
}

private fun reader() {
    val array = CharArray(Character.MAX_VALUE.code)
    val input: Reader = FileReader("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_2_reader_and_writer/_1_2_2_2_1_reader_and_writer/ReaderAndWriter.txt")

    println(".ready(): " + input.ready())

    input.read(array)
    print(".read() : ")
    print(array)

    input.close()
}

private fun writer() {
    val data = "Reader And Writer"
    val output: Writer = FileWriter("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_2_reader_and_writer/_1_2_2_2_1_reader_and_writer/ReaderAndWriter.txt")

    output.write(data)

    output.close()
}