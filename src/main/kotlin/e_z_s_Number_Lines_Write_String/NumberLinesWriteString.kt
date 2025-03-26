package e_z_s_Number_Lines_Write_String

class NumberLinesWriteString {
    fun numberOfLines(widths: IntArray, s: String): IntArray {
        var lines = 1
        var cur = 0

        for (i in s.indices) {
            cur += widths[s[i] - 'a']
            if (cur > 100) {
                lines++
                cur = widths[s[i] - 'a']
            } else if (cur == 100) {
                if (i != s.lastIndex) {
                    lines++
                    cur = 0
                }
            }
        }

        return intArrayOf(lines, cur)
    }
}