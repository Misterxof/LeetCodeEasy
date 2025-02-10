package th_o_se_f_Clear_Digits

import java.lang.StringBuilder

class ClearDigits {
    fun clearDigits(s: String): String {
        val que = ArrayDeque<Char>()
        val result = StringBuilder()

        for (i in s.indices) {
            if (!s[i].isDigit())
                que.addLast(s[i])
            else {
                que.removeLast()
            }
        }

        for (i in que.indices)
            result.append(que[i])

        return result.toString()
    }
}