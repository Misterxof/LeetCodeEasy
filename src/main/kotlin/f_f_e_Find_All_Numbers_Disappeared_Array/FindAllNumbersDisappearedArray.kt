package f_f_e_Find_All_Numbers_Disappeared_Array

import java.util.TreeSet

class FindAllNumbersDisappearedArray {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val result = mutableListOf<Int>()
        val tempSet = TreeSet<Int>()

        for (i in nums.indices) tempSet.add(nums[i])
        for (i in 1 until nums.size + 1)
            if (tempSet.add(i)) result.add(i)

        return result
    }
}