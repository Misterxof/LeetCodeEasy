package th_n_t_Is_Subsequence

class IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        var s = s

        t.toCharArray().forEach {
            if (s.isBlank())
                return true
            else if (s.first() == it)
                s = s.replaceFirst(it.toString(), "")
        }

        return s.isBlank()
    }
}

fun main(args: Array<String>) {
    println("true " + IsSubsequence().isSubsequence("abc", "ahbgdc"))
    println("true " + IsSubsequence().isSubsequence("", "ahbgdc"))
    println("false " + IsSubsequence().isSubsequence("acb", "ahbgdc"))
}