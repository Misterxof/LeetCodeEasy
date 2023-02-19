package t_se_Remove_Element

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var length = nums.size
        var i = 0

        while (i < length) {
            if (nums[i] == `val`) {
                for (j in i + 1 until length)
                    nums[j - 1] = nums[j]
                length--
                continue
            }
            i++
        }

        return length
    }
}

fun main() {
    println(RemoveElement().removeElement(intArrayOf(3, 2, 2, 3), 3))
    println(RemoveElement().removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
}