package se_z_f_Binary_Search

class BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1

        while (start <= end){
            var middleIndex = (start + end) / 2
            val middle = nums[middleIndex]

            if (middle == target) return middleIndex

            if (target > middle)
                start = middleIndex + 1
            else
                end = middleIndex - 1
        }

        return -1
    }
}

fun main() {
    val binarySearch = BinarySearch()
    println(binarySearch.search(nums = intArrayOf(-1,0,3,5,9,12), target = 9))
    println(binarySearch.search(nums = intArrayOf(-1,0,3,5,9,12), target = 2))
    println(binarySearch.search(nums = intArrayOf(2,5), target = 5))
}