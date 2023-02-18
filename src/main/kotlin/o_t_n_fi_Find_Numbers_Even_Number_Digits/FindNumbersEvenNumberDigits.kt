package o_t_n_fi_Find_Numbers_Even_Number_Digits

class FindNumbersEvenNumberDigits {
    fun findNumbers2(nums: IntArray): Int {
        var count = 0

        for (i in nums.indices) {
            if (nums[i].toString().length %2 == 0)
                count++
        }

        return count
    }

    fun findNumbers(nums: IntArray): Int {
        return nums.count { it.toString().length %2 == 0 }
    }
}