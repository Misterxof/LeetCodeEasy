package o_th_f_s_Check_N_Double_Exist

class CheckNDoubleExist {
    fun checkIfExist(arr: IntArray): Boolean {
        for (i in arr.indices) {
            for (j in arr.indices) {
                if (i != j && arr[i] == arr[j] * 2) return true
            }
        }

        return false
    }
}

fun main() {
    println(CheckNDoubleExist().checkIfExist(intArrayOf(10,2,5,3)))
    println(CheckNDoubleExist().checkIfExist(intArrayOf(3,1,7,11)))
}