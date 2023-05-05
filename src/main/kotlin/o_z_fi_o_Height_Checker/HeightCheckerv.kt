package o_z_fi_o_Height_Checker

import java.util.PriorityQueue

class HeightCheckerv {
    fun heightChecker(heights: IntArray): Int {
        val sortedQueue = PriorityQueue<Int>()
        var result = 0

        heights.forEach { sortedQueue.add(it) }
        heights.forEach { if (it != sortedQueue.poll()) result++}

        return result
    }
}