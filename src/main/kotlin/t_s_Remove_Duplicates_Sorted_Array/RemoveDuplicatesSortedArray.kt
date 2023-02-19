package t_s_Remove_Duplicates_Sorted_Array


class RemoveDuplicatesSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var length = nums.size
        var i = 1
        var prev = nums[0]
        var cur = 1

        while (i < nums.size) {
            if (prev == nums[i]) length--
            else  nums[cur++] = nums[i]

            prev = nums[i++]
        }

        return length
    }
}

fun main() {
    println(RemoveDuplicatesSortedArray().removeDuplicates(intArrayOf(1, 1, 2)))
    println(RemoveDuplicatesSortedArray().removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))
}