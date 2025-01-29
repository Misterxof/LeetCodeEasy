package fi_n_f_Longest_Harmonious_Subsequence

import kotlin.math.abs

class LongestHarmoniousSubsequence {
    fun findLHS(nums: IntArray): Int {
        var prev: Pair<Int, Int>? = null
        val map = HashMap<Int, Int>()
        var maxSum = Int.MIN_VALUE

        for (i in nums.indices) {
            if (map.containsKey(nums[i]))
                map[nums[i]] = map[nums[i]]!! + 1
            else map[nums[i]] = 1
        }

        val sort = map.toSortedMap()
        sort.forEach { k, v -> println("k = $k v = $v")}

        sort.forEach { k, v ->
            if (prev == null)
                prev = k to v
            else {
                if (abs(prev!!.first - k) == 1)
                    maxSum = maxOf(maxSum, prev!!.second + v)
                prev = k to v
            }
        }

        return if (maxSum == Int.MIN_VALUE) 0 else maxSum
    }
}

fun main() {
    println(LongestHarmoniousSubsequence().findLHS(intArrayOf(0,3,1,3,3,3,0,1,0,2,0,3,1,3,-3,2,0,3,1,2,2,-3,2,2,3,3)))
}