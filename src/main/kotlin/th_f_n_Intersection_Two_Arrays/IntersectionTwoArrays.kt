package th_f_n_Intersection_Two_Arrays

class IntersectionTwoArrays {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val fHashSet = HashSet<Int>()
        val sHashSet = HashSet<Int>()

        nums1.forEach { fHashSet.add(it) }
        nums2.forEach { sHashSet.add(it) }

        //  builtin
//        val result = fHashSet.intersect(sHashSet)

        // custom, faster
        val result = HashSet<Int>()

        fHashSet.forEach {
            if (sHashSet.contains(it)) result.add(it)
        }

        return result.toIntArray()
    }
}