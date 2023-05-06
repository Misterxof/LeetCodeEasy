package se_f_se_Largest_Number_Twice_Others

class LargestNumberTwiceOthers {
    fun dominantIndex(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        var prevMax = Int.MIN_VALUE
        var maxIndex = 0

        for (i in nums.indices) {
            if (nums[i] > max) {
                prevMax = max
                max = nums[i]
                maxIndex = i
            } else if (nums[i] > prevMax) {
                prevMax = nums[i]
            }
        }

        return if (prevMax * 2 <= max) maxIndex else -1
    }
}