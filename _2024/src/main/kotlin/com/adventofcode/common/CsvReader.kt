package com.adventofcode.common

object CsvReader {

    fun readRowsAsInt(filePath: String): Sequence<List<Int>> {
        val bufferedReader = CsvReader.javaClass.classLoader
            .getResourceAsStream(filePath)?.bufferedReader()
        return sequence {
            bufferedReader.use { bufferedReader ->
                while (true) {
                    val line = bufferedReader?.readLine() ?: break
                    yield(line.split(",").map { it.toInt() })
                }
            }
        }
    }
}