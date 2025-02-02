package o_se_fi_t_Check_Array_Sorted_Rotated

class CheckArraySortedRotated {
    fun check(nums: IntArray): Boolean {
        var counter = 0
        var prev = -1

        for (i in nums.indices) {
            if (prev == -1) {
                prev = nums[i]
            } else {
                if (prev > nums[i]) counter++
                prev = nums[i]
            }
        }

        if (prev > nums[0]) counter++

        return counter <= 1
    }
}