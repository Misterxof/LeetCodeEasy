package t_fi_t_n_Maximum_Count_Positive_Integer_Negative_Integer

class MaximumCountPositiveIntegerNegativeInteger {
    fun maximumCount(nums: IntArray): Int {
        var negCount = 0
        var posCount = 0
        var max = 0

        nums.forEach {
            if (it < 0) negCount++
            else if (it > 0) posCount++

            max = maxOf(negCount, posCount)
        }

        return max
    }
}