package n_se_se_Squares_Sorted_Array

class SquaresSortedArray {
    fun sortedSquares(nums: IntArray): IntArray {
        for (i in nums.indices) {
            nums[i] = nums[i] * nums[i]
        }
        return nums.sortedArray()
    }
}

fun main() {
    println(SquaresSortedArray().sortedSquares(intArrayOf(-4,-1,0,3,10)).joinToString())
}