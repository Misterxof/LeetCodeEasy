package o_t_t_o_Split_String_Balanced_Strings

class SplitStringBalancedStrings {
    fun balancedStringSplit(s: String): Int {
        var l = 0
        var r = 0
        var result = 0

        for (i in s.indices) {
            if (s[i] == 'L') l++
            else r++

            if (l == r) {
                result++
                l = 0
                r = 0
            }
        }

        return result
    }
}