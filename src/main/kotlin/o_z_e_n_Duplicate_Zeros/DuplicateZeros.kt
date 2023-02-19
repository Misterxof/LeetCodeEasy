package o_z_e_n_Duplicate_Zeros

class DuplicateZeros {
    fun duplicateZeros(arr: IntArray): Unit {
        val result = IntArray(arr.size)
        var j = 0

        for (i in arr.indices) {
            if (j <= result.size - 1) {
                if (arr[i] == 0){
                    result[j++] = arr[i]
                    if (j + 1 <= result.size) result[j++] = arr[i]
                } else result[j++] = arr[i]
            }
        }

        result.forEachIndexed { i, it -> arr[i] = it }
    }
}

fun main() {
    DuplicateZeros().duplicateZeros(intArrayOf(1,5,2,0,6,8,0,6,0))
}