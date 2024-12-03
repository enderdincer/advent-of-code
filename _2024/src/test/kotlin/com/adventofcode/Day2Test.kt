package com.adventofcode

import com.adventofcode.common.CsvReader
import com.adventofcode.common.SolutionPrinter
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day2Test {

    @Test
    fun `Should solve part 1 example`() {
        val rows = CsvReader.readRowsAsInt("day2/example-part1-input.csv", " ").toList()
        val actual = Day2.solvePart1(rows)
        val expected = 2
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `should solve part 1 real input`() {
        val rows = CsvReader.readRowsAsInt("day2/part1-input.csv", " ").toList()
        val solution = Day2.solvePart1(rows)
        SolutionPrinter.print(solution)
    }

    @Test
    fun `Should solve part 2 example`() {
        val rows = CsvReader.readRowsAsInt("day2/example-part1-input.csv", " ").toList()
        val actual = Day2.solvePart2(rows)
        val expected = 4
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `Should solve part 2 my example`() {
        val rows = listOf(listOf(8,3,7,6,5))
        val actual = Day2.solvePart2(rows)
        val expected = 1
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `Should solve part 2 my example_two`() {
        val rows = listOf(listOf(1,2,7,8,9))
        val actual = Day2.solvePart2(rows)
        val expected = 0
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `Should solve part 2 real input`() {
        val rows = CsvReader.readRowsAsInt("day2/part1-input.csv", " ").toList()
        val solution = Day2.solvePart2(rows)
        SolutionPrinter.print(solution)
    }
}