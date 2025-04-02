package t_e_se_th_Maximum_Value_Ordered_TripletI

class MaximumValueOrderedTripletI {
    fun maximumTripletValue(nums: IntArray): Long {
        var result = 0L

        for (i in nums.indices) {
            for (j in i + 1..nums.lastIndex) {
                for (k in j + 1..nums.lastIndex)
                    result = maxOf(result, ((nums[i].toLong() - nums[j].toLong()) * nums[k].toLong()))
            }
        }

        return result
    }
}