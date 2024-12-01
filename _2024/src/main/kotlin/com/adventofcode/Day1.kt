package com.adventofcode

import kotlin.math.abs

object Day1 {
    fun solvePart1(left: List<Int>, right: List<Int>): Int {
        val sortedLeft = left.sorted()
        val sortedRight = right.sorted()
        return sortedLeft.indices.sumOf { i -> abs(sortedLeft[i] - sortedRight[i]) }
    }

    fun solvePart2(left: List<Int>, right: List<Int>): Int {
        val rightCounts = right.groupingBy { it }.eachCount()
        return left.sumOf { it * (rightCounts[it] ?: 0) }
    }
}