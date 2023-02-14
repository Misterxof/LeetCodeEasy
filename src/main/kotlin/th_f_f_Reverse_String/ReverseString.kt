package th_f_f_Reverse_String

class ReverseString {
    fun reverseString(s: CharArray): Unit {
        for (i in s.indices) {
            if (i <= s.size - 1 - i)
                s[i] = s[s.size - 1 - i].also { s[s.size - 1 - i] = s[i] }
            else break
        }
    }
}

fun main() {
    ReverseString().reverseString(charArrayOf('h','e','l','l','o'))
    ReverseString().reverseString(charArrayOf('H','a','n','n','a','h'))
}