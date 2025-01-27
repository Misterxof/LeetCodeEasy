package t_o_n_Contains_DuplicateII

import kotlin.math.abs

class ContainsDuplicateII {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            if (map.containsKey(nums[i])){
                if (abs(map[nums[i]]!! - i) <= k)
                    return true
                else map[nums[i]] = i
            } else map[nums[i]] = i
        }

        return false
    }
}