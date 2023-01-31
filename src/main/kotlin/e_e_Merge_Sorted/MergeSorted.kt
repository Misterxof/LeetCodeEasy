package e_e_Merge_Sorted

class MergeSorted {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        for ((j, i) in (m until nums1.size).withIndex()){
            nums1[i] = nums2[j]
        }

        nums1.sort()
    }

    // ~10% in R and M faster then first one
    fun merge2(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        if (nums1.size == 1 && n != 0){
            nums1[0] = nums2[0]
        }

        var j = n - 1
        var i = m - 1
        var k = nums1.size - 1

        while (k != -1){
            if (j == -1) return

            if (i == -1) {
                nums1[k] = nums2[j]
                j--
                k--
                continue
            }

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]
                i--
            }
            else {
                nums1[k] = nums2[j]
                j--
            }
            k--
        }
    }
}

fun main(args: Array<String>) {
    var nums1 = intArrayOf(1,2,3,0,0,0)
    var nums2 = intArrayOf(2,5,6,)
    MergeSorted().merge2(nums1,3, nums2,3)
    println(nums1.joinToString())

    nums1 = intArrayOf(1)
    nums2 = intArrayOf()
    MergeSorted().merge2(nums1,1, nums2,0)
    println(nums1.joinToString())

    nums1 = intArrayOf(0)
    nums2 = intArrayOf(1)
    MergeSorted().merge2(nums1,0, nums2,1)
    println(nums1.joinToString())

    nums1 = intArrayOf(2,0)
    nums2 = intArrayOf(1,)
    MergeSorted().merge2(nums1,1, nums2,1)
    println(nums1.joinToString())

    nums1 = intArrayOf(4,5,6,0,0,0)
    nums2 = intArrayOf(1,2,3,)
    MergeSorted().merge2(nums1,3, nums2,3)
    println(nums1.joinToString())
}