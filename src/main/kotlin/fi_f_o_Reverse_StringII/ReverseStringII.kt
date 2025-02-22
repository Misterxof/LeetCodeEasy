package fi_f_o_Reverse_StringII

import kotlin.math.min

class ReverseStringII {
    fun reverseStr(s: String, k: Int): String {
        val ans = s.toCharArray()
        var i = 0

        while (i < ans.size) {
            var l = i
            var r = min(i + k - 1, ans.lastIndex)

            while (l < r) {
                ans[l] = ans[r].also { ans[r--] = ans[l++] }
            }

            i += k * 2
        }

        return String(ans)
    }
}