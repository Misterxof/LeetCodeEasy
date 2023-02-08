package th_fi_Search_Insert_Position

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1
        var middleIndex = 0

        while (start <= end){
            middleIndex = (start + end) / 2
            val middle = nums[middleIndex]

            if (middle == target) return middleIndex

            if (target > middle)
                start = middleIndex + 1
            else
                end = middleIndex - 1
        }

        return if (nums[middleIndex] < target) middleIndex + 1 else middleIndex
    }
}

fun main() {
    val searchInsertPosition = SearchInsertPosition()
    println(searchInsertPosition.searchInsert(nums = intArrayOf(1,3,5,6), target = 2))
    println(searchInsertPosition.searchInsert(nums = intArrayOf(1,3,5,6), target = 7))
    println(searchInsertPosition.searchInsert(nums = intArrayOf(1,3,5,6), target = 0))
}