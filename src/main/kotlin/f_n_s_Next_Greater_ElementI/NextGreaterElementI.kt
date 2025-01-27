package f_n_s_Next_Greater_ElementI

class NextGreaterElementI {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val res = IntArray(nums1.size)
        val map = HashMap<Int, Int>()

        loop@ for (i in nums2.indices) {
            for (j in i..nums2.lastIndex) {
                if (j != i){
                    if (nums2[j] > nums2[i]) {
                        map[nums2[i]] = nums2[j]
                        continue@loop
                    }
                    if (j == nums2.lastIndex) {
                        map[nums2[i]] = -1
                    }
                }
            }
        }
        map[nums2[nums2.lastIndex]] = -1

        for (i in nums1.indices) {
            res[i] = map[nums1[i]]!!
        }

        return res
    }
}