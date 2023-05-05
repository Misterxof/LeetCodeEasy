package n_o_fi_Sort_Array_Parity

class SortArrayParity {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var swapPointer = 0

        for (i in nums.indices) {
            if (i == swapPointer && nums[i] % 2 == 0) {
                swapPointer++
                continue
            }
            if (nums[i] % 2 == 0) nums[i] = nums[swapPointer].apply { nums[swapPointer++] = nums[i] }
        }

        return nums
    }
}

fun main() {
    println(SortArrayParity().sortArrayByParity(intArrayOf(3,1,2,4)).joinToString())
}