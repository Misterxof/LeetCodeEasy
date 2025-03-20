package n_o_se_Reverse_Only_Letters

class ReverseOnlyLetters {
    fun reverseOnlyLetters2(s: String): String {
        val stack = ArrayDeque<Char>()
        val result = StringBuilder()

        s.forEach {
            if (it in 'a'..'z' || it in 'A'..'Z')
                stack.addLast(it)
        }

        for (i in s.indices) {
            if (s[i] in 'a'..'z' || s[i] in 'A'..'Z') {
                result.append(stack.removeLast())
            } else {
                result.append(s[i])
            }
        }

        return result.toString()
    }

    fun reverseOnlyLetters(s: String): String {
        val result = s.toCharArray()
        var left = 0
        var right = result.lastIndex

        while (left < right) {
            while (left < right && !result[left].isLetter()) left++
            while (left < right && !result[right].isLetter()) right--

            if (left < right) {
                result[left] = result[right].apply { result[right] = result[left] }
                left++
                right--
            }
        }

        return String(result)
    }
}