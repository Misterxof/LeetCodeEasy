package o_t_n_n_Replace_Elements_GE_Right_Side

class ReplaceElementsGERightSide {
    fun replaceElements2(arr: IntArray): IntArray {
        var max = 0
        var maxIndex = -1

        for (i in arr.indices) {
            if (i == arr.lastIndex) {
                arr[i] = -1
                break
            }

            if (maxIndex > i) {
                arr[i] = arr[maxIndex]
            } else {
                max = 0
                for (j in i + 1 until arr.size) {
                    if (max < arr[j]) {
                        max = arr[j]
                        maxIndex = j
                    }
                }
                arr[i] = arr[maxIndex]
            }
        }

        return arr
    }

    fun replaceElements(arr: IntArray): IntArray {
        var max = -1

        for (i in arr.lastIndex downTo 0) {
            val temp = arr[i]
            arr[i] = max
            max = maxOf(max, temp)
        }

        return arr
    }
}