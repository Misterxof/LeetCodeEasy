package o_z_z_t_Find_Common_Characters

class FindCommonCharacters {
    fun commonChars(words: Array<String>): List<String> {
        val result = mutableListOf<String>()
        var prev = toArr(words[0])

        for (i in words.indices) {
            val cur = toArr(words[i])

            for (j in cur.indices) {
                if (cur[j] == 0) prev[j] = 0
                if (cur[j] < prev[j]) prev[j] = cur[j]
            }
        }

        for (i in prev.indices) {
            if (prev[i] != 0) {
                for (j in 0..prev[i]) {
                    result.add ("${Char(i + 'a'.code)}")
                }
            }
        }

        return result
    }

    fun toArr(string: String): IntArray {
        val letters = IntArray(26)

        string.forEach {
            letters[it - 'a'] += 1
        }

        return letters
    }
}