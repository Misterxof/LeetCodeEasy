package s_n_se_Degree_Array

import kotlin.math.abs

class DegreeArray {
    fun findShortestSubArray(nums: IntArray): Int {
        val map = HashMap<Int, Num>()
        var max = -1
        var result = nums.size

        if(nums.size == 1) return 1

        for (i in nums.indices) {
            if (map.containsKey(nums[i])) {
                map[nums[i]]!!.last = i
                map[nums[i]]!!.counter = map[nums[i]]!!.counter + 1
            } else {
                map[nums[i]] = Num(i, 0, 1)
            }
        }

        map.forEach { k, v ->
            if (v.counter > max) {
                max = v.counter
            }
        }

        map.forEach { k, v ->
            if (v.counter == max) {

                result = minOf(result, (abs(v.last - v.first) + 1))
            }
        }

        return result
    }

    data class Num(var first: Int, var last: Int, var counter: Int)
}

fun main() {
    println(DegreeArray().findShortestSubArray(intArrayOf(1,2,2,3,1)))
    println(DegreeArray().findShortestSubArray(intArrayOf(1,2,2,3,1,4,2)))
    println(DegreeArray().findShortestSubArray(intArrayOf(1,2)))
}