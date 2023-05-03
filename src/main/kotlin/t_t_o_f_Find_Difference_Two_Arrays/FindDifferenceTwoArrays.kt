package t_t_o_f_Find_Difference_Two_Arrays

class FindDifferenceTwoArrays {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val maxi = if (nums1.size >= nums2.size) nums1.size - 1 else nums2.size - 1
        val firstSet = mutableSetOf<Int>()
        val secondSet = mutableSetOf<Int>()
        val firstList = mutableListOf<Int>()
        val secondList = mutableListOf<Int>()
        var i = maxi

        while (i >= 0) {
            if (i <= nums2.lastIndex) secondSet.add(nums2[i])
            if (i <= nums1.lastIndex) firstSet.add(nums1[i])
            i--
        }

        i = maxi

        while (i >= 0) {
            if (i <= nums1.lastIndex && secondSet.add(nums1[i])) firstList.add(nums1[i])
            if (i <= nums2.lastIndex && firstSet.add(nums2[i])) secondList.add(nums2[i])
            i--
        }

        return listOf(firstList, secondList)
    }
}

fun main() {
    println(FindDifferenceTwoArrays().findDifference(intArrayOf(1,2,3), intArrayOf(2,4,6)))
}