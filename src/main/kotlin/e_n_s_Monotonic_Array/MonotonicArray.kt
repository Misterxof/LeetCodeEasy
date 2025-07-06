package e_n_s_Monotonic_Array

class MonotonicArray {
    fun isMonotonic(nums: IntArray): Boolean {
        var up = nums[0]
        var down = nums[0]
        var isUp = true
        var isDown = true

        for (i in nums.indices) {
            if (up <= nums[i]) up = nums[i]
            else isUp = false

            if (down >= nums[i]) down = nums[i]
            else isDown = false
        }

        return isUp || isDown
    }
}