package o_f_f_s_Consecutive_Characters

class ConsecutiveCharacters {
    fun maxPower(s: String): Int {
        var max = 1
        var count = 1

        for (i in 1..s.lastIndex) {
            if (s[i] == s[i - 1]) count++
            else {
                max = maxOf(count, max)
                count = 1
            }
        }
        max = maxOf(count, max)

        return max
    }
}