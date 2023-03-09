package t_s_e_Missing_Number

import java.util.TreeSet

class MissingNumber {
    fun missingNumber2(nums: IntArray): Int {
        var mustBeSum = 0

        for (i in 0..nums.size) {
            mustBeSum += i
        }

        return mustBeSum - nums.sum()
    }

    // faster
    fun missingNumber(nums: IntArray): Int {
        return nums.size * (nums.size + 1) / 2 - nums.sum()
    }


}

fun main() {
    println(MissingNumber().missingNumber(intArrayOf( 0, 1)))
}