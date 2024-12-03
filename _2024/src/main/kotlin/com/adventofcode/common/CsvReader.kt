package com.adventofcode.common

object CsvReader {

    fun readRowsAsInt(filePath: String, delimiter: String = ","): Sequence<List<Int>> {
        val bufferedReader = CsvReader.javaClass.classLoader
            .getResourceAsStream(filePath)?.bufferedReader()
        return sequence {
            bufferedReader.use { bufferedReader ->
                while (true) {
                    val line = bufferedReader?.readLine() ?: break
                    yield(line.split(delimiter).map { it.toInt() })
                }
            }
        }
    }
}