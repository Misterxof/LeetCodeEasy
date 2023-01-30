package se_t_f_Find_Pivot_Index

class Solution {

    // time limit exceeded
    fun pivotIndex(nums: IntArray): Int {
        var leftSum = 0
        var rightSum = 0

        nums.forEachIndexed { index, value ->
            when(index) {
                0 -> {
                    leftSum = 0
                    rightSum = nums.takeLast(nums.size - 1).sum()
                }
                nums.size - 1 -> {
                    leftSum = nums.take(index).sum()
                    rightSum = 0
                }
                else -> {
                    leftSum = nums.take(index).sum()
                    rightSum = nums.takeLast(nums.size - index - 1).sum()
                }
            }

            if (leftSum == rightSum){
                return index
            }
        }
        return -1
    }

    fun pivotIndex3(nums: IntArray): Int {
        var hashMap: HashMap<Int, Int> = hashMapOf()    // index, leftSum
        var leftSum = 0

        nums.reversed().forEachIndexed { index, value ->

            if (index == 0)
                leftSum = 0

            hashMap[index] = leftSum

            leftSum += value
        }

        nums.forEachIndexed { index, value ->
            var reversedIndex = nums.size - index -1

            if (index == 0)
                leftSum = 0

            if (leftSum == hashMap[reversedIndex]){

                return index
            }

            leftSum += value
        }

        return -1
    }
}