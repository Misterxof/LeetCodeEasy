package o_e_z_z_Maximum_Ascending_Subarray_Sum

class MaximumAscendingSubarraySum {
    fun maxAscendingSum(nums: IntArray): Int {
        var max = 0
        var sum = 0

        if (nums.size == 1) return nums[0]

        for (i in nums.indices) {
            sum += nums[i]
            max = maxOf(max, sum)

            if (i + 1 < nums.size && nums[i] >= nums[i + 1])
                sum = 0
        }

        return max
    }
}