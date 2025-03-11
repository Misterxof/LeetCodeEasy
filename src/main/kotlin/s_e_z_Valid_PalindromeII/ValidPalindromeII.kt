package s_e_z_Valid_PalindromeII

class ValidPalindromeII {
    fun validPalindrome(s: String): Boolean {
        var l = 0
        var r = s.lastIndex

        while (l < r) {
            if (s[l] != s[r]) {
                return isPalindrome(s, l, r - 1) ||
                        isPalindrome(s, l + 1, r)
            }
            l++
            r--
        }

        return true
    }

    fun isPalindrome(s: String, l: Int, r: Int): Boolean {
        var l = l
        var r = r

        while (l < r) {
            if (s[l++] != s[r--]) return false
        }

        return true
    }
}