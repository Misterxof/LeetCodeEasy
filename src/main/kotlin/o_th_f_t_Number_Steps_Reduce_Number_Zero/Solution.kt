package o_th_f_t_Number_Steps_Reduce_Number_Zero

class Solution {
    fun numberOfSteps(num: Int): Int {
        var number = num
        var steps = 0

        if (number == 0) return 0

        while (number != 0) {
            if (number % 2 == 0) {
                number /= 2
                steps++
            } else {
                number--
                steps++
            }
        }

        return steps
    }
}