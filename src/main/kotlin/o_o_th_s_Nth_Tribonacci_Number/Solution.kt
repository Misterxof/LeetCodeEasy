package o_o_th_s_Nth_Tribonacci_Number

class Solution {
    fun tribonacci(n: Int): Int {
        when(n) {
            0 -> return 0
            1, 2  -> return 1
        }

        var result = 0
        var tNext = 0
        var tFirst = 1
        var tSecond = 1
        var tThird = 0
        for (i in 3..n){
            tNext = tFirst + tSecond + tThird

            if (i == n)
                result = tNext

            tThird = tSecond
            tSecond = tFirst
            tFirst = tNext
        }

        return result
    }
}