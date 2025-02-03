package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_2_reader_and_writer._1_2_2_2_3_file_reader_and_writer

import java.io.FileReader
import java.io.FileWriter

// • Methods of File(Reader/Writer)

/**
 * <h1>Methods of File(Reader/Writer)</h1>
 * <h2>Methods of FileReader</h2>
 *
 * The FileReader class provides implementations for different methods present in the Reader class.
 *
 *  * **read()**
 *
 *  * **read()** - reads a single character from the reader
 *  * **read(char[] array)** - reads the characters from the reader and stores in the specified array
 *  * **read(char[] array, int start, int length)** - reads the number of characters equal to length from the reader and stores in the specified array starting from the position start
 *
 *
 *  * **getEncoding()** - The getEncoding() method can be used to get the type of encoding that is used to store data in the file
 *  * **close()** - To close the file reader, we can use the close() method. Once the close() method is called, we cannot use the reader to read the data.
 *  * **ready()** - checks if the file reader is ready to be read
 *  * **mark()** - mark the position in file reader up to which data has been read
 *  * **reset()** - returns the control to the point in the reader where the mark was set
 *
 * <h2>Methods of FileWriter</h2>
 *
 * The FileWriter class provides implementations for different methods present in the Writer class.
 *
 *  * **write()**
 *
 *  * **write()** - writes a single character to the writer
 *  * **write(char[] array)** - writes the characters from the specified array to the writer
 *  * **write(String data)** - writes the specified string to the writer
 *
 *
 *  * **getEncoding()** - The getEncoding() method can be used to get the type of encoding that is used to write data.
 *  * **close()** - To close the file writer, we can use the close() method. Once the close() method is called, we cannot use the writer to write the data.
 *  * **flush()** - forces to write all the data present in the writer to the corresponding destination
 *  * **append()** - inserts the specified character to the current writer
 *
 */

fun main() {
    fileWriter()
    fileReader()
}

private fun fileReader() {
    val array = CharArray(Character.MAX_VALUE.code)
    val input = FileReader("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_2_reader_and_writer/_1_2_2_2_3_file_reader_and_writer/FileReaderAndWriter.txt")

    input.read(array)
    print(".read(): ")
    println(array)

    input.close()
}

private fun fileWriter() {
    val data = "File Reader And Writer"
    val file = FileWriter("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_2_reader_and_writer/_1_2_2_2_3_file_reader_and_writer/FileReaderAndWriter.txt")

    file.write(data)

    file.close()
}