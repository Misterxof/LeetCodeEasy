package t_o_se_Contains_Duplicate

class Solution {
    fun containsDuplicate2(nums: IntArray): Boolean {
        val hashMap: HashMap<Int, Int> = hashMapOf()

        nums.forEachIndexed() { index, value ->
            if (hashMap.containsKey(value))
                hashMap.computeIfPresent(value) { k, v -> v + 1 }
            else
                hashMap[value] = 1
        }

        hashMap.forEach {
            if (it.value > 1)
                return true
        }

        return false
    }

    // Better
    fun containsDuplicate(nums: IntArray): Boolean {
        val mutableSet: MutableSet<Int> = mutableSetOf()

        for (i in nums) {
            if (!mutableSet.add(i))
                return false
        }

        return true
    }
}