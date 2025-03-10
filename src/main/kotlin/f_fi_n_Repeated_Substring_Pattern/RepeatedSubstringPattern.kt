package f_fi_n_Repeated_Substring_Pattern

class RepeatedSubstringPattern {
    fun repeatedSubstringPattern(s: String): Boolean {
        val cur = StringBuilder()
        val res = StringBuilder()

        for (i in 0..s.length / 2) {
            cur.append(s[i])

            repeat(s.length / (i + 1)) {
                res.append(cur)
            }

            if (res.toString() == s && s.length != cur.length) return true

            res.clear()
        }

        return false
    }
}