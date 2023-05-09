package fi_s_o_Array_Partition

import java.util.PriorityQueue

class ArrayPartition {
    fun arrayPairSum(nums: IntArray): Int {
        var sum = 0
        var startPointer = 0
        var endPointer = nums.lastIndex - 1

        nums.sort()

        while (startPointer < endPointer) {
            sum += nums[startPointer]
            sum += nums[endPointer]
            startPointer += 2
            endPointer -= 2
        }

        if ((nums.size / 2) % 2 == 1)
            sum += nums[startPointer]

        return sum
    }

    fun arrayPairSum2(nums: IntArray): Int {
        val priorityQueue = PriorityQueue<Int>()
        var sum = 0
        var i = 0

        nums.forEach { priorityQueue.add(it) }

        while (i <= nums.lastIndex) {
            sum += minOf(priorityQueue.poll(), priorityQueue.poll())
            i += 2
        }

        return sum
    }
}

fun main() {
    println(ArrayPartition().arrayPairSum(intArrayOf(6,2,6,5,1,2)))
}