package s_f_fi_Set_Mismatch

class SetMismatch {
    fun findErrorNums(nums: IntArray): IntArray {
        val arr = IntArray(nums.size)
        var duplicate = 0

        for (i in nums.indices) {
            if (arr[nums[i] - 1] == 0)
                arr[nums[i] - 1] += 1
            else duplicate = nums[i]
        }

        for (i in arr.indices) {
            if (arr[i] == 0)
                return intArrayOf(duplicate, i + 1)
        }

        return intArrayOf()
    }
}