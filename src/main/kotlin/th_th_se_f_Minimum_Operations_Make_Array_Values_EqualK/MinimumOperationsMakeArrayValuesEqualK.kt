package th_th_se_f_Minimum_Operations_Make_Array_Values_EqualK

class MinimumOperationsMakeArrayValuesEqualK {
    fun minOperations(nums: IntArray, k: Int): Int {
        val min = nums.min()
        val set = HashSet<Int>()
        var result = 0
        if (k > min) return -1
        if (min > k) result += 1

        nums.forEach {
            if (it != min) {
                if (!set.contains(it)){
                    set.add(it)
                    result++
                }
            }
        }

        return result
    }
}