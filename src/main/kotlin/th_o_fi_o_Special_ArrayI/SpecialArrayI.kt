package th_o_fi_o_Special_ArrayI

class SpecialArrayI {
    fun isArraySpecial(nums: IntArray): Boolean {
        if(nums.size == 1) return true
        var prev = nums[0] % 2 == 0

        for (i in 1..nums.lastIndex) {
            if (prev != (nums[i] % 2 == 0)) {
                prev = !prev
            } else return false
        }

        return true
    }
}