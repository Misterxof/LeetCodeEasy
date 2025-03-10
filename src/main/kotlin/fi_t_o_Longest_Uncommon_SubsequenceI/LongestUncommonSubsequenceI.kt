package fi_t_o_Longest_Uncommon_SubsequenceI

class LongestUncommonSubsequenceI {
    fun findLUSlength2(a: String, b: String): Int {
        var max = -1
        val c = StringBuilder()

        for (i in a.indices) {
            c.append(a[i])
            if (!b.contains(c.toString())) max = maxOf(max, c.length)
        }

        c.clear()

        for (i in b.indices) {
            c.append(b[i])
            if (!a.contains(c.toString())) max = maxOf(max, c.length)
        }

        return max
    }

    fun findLUSlength(a: String, b: String): Int {
        if (a == b) return -1

        return maxOf(a.length, b.length)
    }
}