package t_e_th_Move_Zeroes

class MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        var insertPos = 0

        nums.forEach {
            if(it != 0) {
                nums[insertPos] = it
                insertPos++
            }
        }

        for(i in insertPos until nums.size)
            nums[i] = 0
    }
}

fun main() {
    MoveZeroes().moveZeroes(intArrayOf(0,1,0,3,12))
    MoveZeroes().moveZeroes(intArrayOf(0,0,1))
}