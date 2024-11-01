package o_t_fi_Valid_Palindrome

class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        var i = 0
        var j = s.length - 1

        loop@ while (i < j) {
            if (!s[i].isDigit() && !s[i].isLetter()) {
                i++
                continue@loop
            }
            if (!s[j].isDigit() && !s[j].isLetter()) {
                j--
                continue@loop
            }
            if (s[i].lowercaseChar() != s[j].lowercaseChar()) return false
            i++
            j--
        }

        return true
    }
}

fun main() {
    println(ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"))
    println(ValidPalindrome().isPalindrome("0P"))
}