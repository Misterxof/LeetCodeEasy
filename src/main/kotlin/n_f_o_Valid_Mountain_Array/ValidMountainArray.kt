package n_f_o_Valid_Mountain_Array

class ValidMountainArray {
    fun validMountainArray(arr: IntArray): Boolean {
        if (arr.size < 3) return false

        var pick = -1
        var prev = -1
        var isPick = false
        var isLeft = false

        for (i in arr.indices) {
            if (prev == arr[i]) return false
//            println("${arr[i]} $prev $isPick")
            if (!isPick && pick < arr[i]) pick = arr[i]
            else if (pick <= arr[i]) return false
//            println("-")
            if (prev > arr[i] && !isPick && isLeft) isPick = true
            else if (arr[i] >= pick && isPick) return false

            if (prev < arr[i] && !isLeft && prev != -1) isLeft = true
            else if (prev < arr[i] && isPick) return false

            prev = arr[i]
        }

        return isPick
    }
}

fun main() {
    println(ValidMountainArray().validMountainArray(intArrayOf(2,1)))
    println(ValidMountainArray().validMountainArray(intArrayOf(3,5,5)))
    println(ValidMountainArray().validMountainArray(intArrayOf(0,3,2,1)))
    println(ValidMountainArray().validMountainArray(intArrayOf(2,0,2)))
    println(ValidMountainArray().validMountainArray(intArrayOf(9,8,7,6,5,4,3,2,1,0)))
    println(ValidMountainArray().validMountainArray(intArrayOf(0,1,2,4,2,1)))
}