package o_f_e_z_Running_Sum_Array

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var result = IntArray(nums.size)

        nums.forEachIndexed { index, value ->
            result[index] = nums.take(index + 1).sum()
        }

        return result
    }
}