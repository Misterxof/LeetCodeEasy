package th_f_fi_Reverse_Vowels_String

class ReverseVowelsString {
    fun reverseVowels(s: String): String {
        val stack = ArrayDeque<Char>()
        val res = s.toCharArray()

        s.forEach {
            when(it.lowercaseChar()) {
                'a', 'i', 'e', 'o', 'u' -> stack.addLast(it)
            }
        }

        res.forEachIndexed { index, c ->
            when(c.lowercaseChar()) {
                'a', 'i', 'e', 'o', 'u' -> res[index] = stack.removeLast()
            }
        }

        return res.joinToString("")
    }
}