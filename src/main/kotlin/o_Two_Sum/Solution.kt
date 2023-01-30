package o_Two_Sum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { firstIndex, first ->
            nums.forEachIndexed { secondIndex, second ->
                if (secondIndex != firstIndex){
                    if (first + second == target)
                        return intArrayOf(firstIndex, secondIndex)
                }
            }
        }
        return intArrayOf(0)
    }
}