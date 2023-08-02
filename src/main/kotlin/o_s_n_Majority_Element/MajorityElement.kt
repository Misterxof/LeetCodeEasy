package o_s_n_Majority_Element

import java.util.TreeMap

class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        val treeMap = TreeMap<Int, Int>()
        var maxValue = 0
        var result = 0

        for (i in nums.indices) {
            if (treeMap.containsKey(nums[i])) treeMap[nums[i]] = treeMap.getValue(nums[i]) + 1
            else treeMap[nums[i]] = 1
        }

        treeMap.forEach {
            if (maxValue < it.value) {
                maxValue = it.value
                result = it.key
            }
        }

        return result
    }

    // Boyer-Moore Majority Vote Algorithm
    fun majorityElement2(nums: IntArray): Int {
        var result = 0
        var counter = 0

        for (i in nums.indices) {
            if (counter == 0) {
                result = nums[i]
                counter++
            } else {
                if (result == nums[i]) counter++
                else counter--
            }
        }

        return result
    }
}