package com.adventofcode

object Day2 {

    fun solvePart1(rows: List<List<Int>>) =
        rows.count { isSafe(it) }


    fun solvePart2(rows: List<List<Int>>) =
        rows.count { isSafeWithSkipping(it) }

    private fun isSafe(row: List<Int>) =
        isIncreasing(row) || isDecreasing(row)

    private fun isSafeWithSkipping(row: List<Int>): Boolean {
        for (i in row.indices) {
            val skippedRow = row.filterIndexed { index, _ -> index != i }
            if (isDecreasing(skippedRow)) return true
            if (isIncreasing(skippedRow)) return true
        }
        return false
    }

    private fun isDecreasing(row: List<Int>): Boolean {
        for (i in 0 until row.size - 1) {
            val diff = row[i] - row[i + 1]
            if (breaksRule(diff))
                return false
        }
        return true
    }

    private fun isIncreasing(row: List<Int>): Boolean {
        for (i in 0 until row.size - 1) {
            val diff = row[i + 1] - row[i]
            if (breaksRule(diff))
                return false
        }
        return true
    }

    private fun breaksRule(diff: Int) =
        diff <= 0 || diff > 3
}