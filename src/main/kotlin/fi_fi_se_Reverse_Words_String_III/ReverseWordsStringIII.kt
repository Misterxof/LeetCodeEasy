package fi_fi_se_Reverse_Words_String_III

class ReverseWordsStringIII {
    fun reverseWords2(s: String): String {
        var res = ""
        var word = ""

        s.forEachIndexed { i, it ->
            if (it.isWhitespace()) {
                res += word + it
                word = ""
            } else word = it + word

            if (i == s.length - 1) res += word
        }

        return res
    }

    // faster
    fun reverseWords(s: String): String {
        return s.split(" ").joinToString(" ") { it.reversed() }
    }
}

fun main() {
    println(ReverseWordsStringIII().reverseWords("Let's take LeetCode contest"))
}