package f_e_fi_Max_Consecutive_Ones

class MaxConsecutiveOnes {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0
        var count = 0

        nums.forEach {
            if (it != 0) {
                count++
            } else {
                max = maxOf(max, count)
                count = 0
            }
        }
        max = maxOf(max, count)

        return max
    }
}