package th_o_z_fi_Longest_Strictly_IncreasingSDS

class LongestStrictlyIncreasingSDS {
    fun longestMonotonicSubarray(nums: IntArray): Int {
        var counterU = 1
        var counterD = 1
        var max = 1

        for (i in nums.indices) {
            if (i + 1 < nums.size) {
                if (nums[i + 1] > nums[i]) {
                    counterU++
                    counterD = 1
                } else if (nums[i + 1] < nums[i]) {
                    counterU = 1
                    counterD++
                } else {
                    counterU = 1
                    counterD = 1
                }

                max = maxOf(max, maxOf(counterD, counterU))
            }
        }

        return max
    }
}

fun main() {
    println(LongestStrictlyIncreasingSDS().longestMonotonicSubarray(intArrayOf(1,1,5)))
    println(LongestStrictlyIncreasingSDS().longestMonotonicSubarray(intArrayOf(1,4,3,3,2)))
    println(LongestStrictlyIncreasingSDS().longestMonotonicSubarray(intArrayOf(3,3,3,3)))
    println(LongestStrictlyIncreasingSDS().longestMonotonicSubarray(intArrayOf(3,2,1)))
    println(LongestStrictlyIncreasingSDS().longestMonotonicSubarray(intArrayOf(1,3,4)))
}