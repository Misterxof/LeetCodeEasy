package th_fi_z_Intersection_Two_Arrays


class IntersectionTwoArrays {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val result: MutableList<Int> = mutableListOf()
        lateinit var smallest: IntArray
        lateinit var biggest: IntArray

        if (nums1.size <= nums2.size){
            smallest = nums1
            biggest = nums2
        } else {
            smallest = nums2
            biggest = nums1
        }

        smallest.forEachIndexed first@{ i, it ->
            biggest.forEachIndexed { j, jt ->
                if (it == jt) {
                    result.add(it)
                    biggest[j] = -1
                    return@first
                }
            }

        }

        return result.toIntArray()
    }
}

fun main(args: Array<String>) {
    println(IntersectionTwoArrays().intersect(intArrayOf(1,2,2,1), intArrayOf(2,2)).joinToString())
    println(IntersectionTwoArrays().intersect(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4)).joinToString())
    println(IntersectionTwoArrays().intersect(intArrayOf(3,1,2), intArrayOf(1,1)).joinToString())
}