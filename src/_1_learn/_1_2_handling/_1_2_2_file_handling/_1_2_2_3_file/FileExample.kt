package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_3_file

import java.io.File
import java.io.FileReader
import java.io.FileWriter

fun main() {
    file()
}

private fun file() {
    val array = CharArray(Character.MAX_VALUE.code)
    val file = File("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_3_file/File.txt")

    println(".createNewFile()         : " + file.createNewFile())

    println(".getName()               : " + file.name)

    println(".lastModified()          : " + file.lastModified())

    file.setWritable(true)
    println(".canWrite() after        : " + file.canWrite())

    println(".canRead()               : " + file.canRead())

    println(".getCanonicalPath() after: " + file.canonicalPath)

    val data = "File"
    val fileWriter = FileWriter(file)
    fileWriter.write(data)
    fileWriter.close()

    val fileReader = FileReader(file)
    val CHARACTERS_READ = fileReader.read(array)
    print(".read() after            : ")
    println(String(array, 0, CHARACTERS_READ).trim { it <= ' ' })
    fileReader.close()

    print(".delete()                : " + file.delete())
}