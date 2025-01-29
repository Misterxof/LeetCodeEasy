package e_o_n_Most_Common_Word

class MostCommonWord {
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val map = HashMap<String, Int>()
        var max = 0
        var key = ""
        var word = StringBuilder()
        val paragraph = paragraph.toLowerCase()

        for (i in paragraph.indices){
            if (paragraph[i] in 'a'..'z') {
                word.append(paragraph[i])
            } else {
                val w = word.toString()
                word.clear()
                if (w != "") {
                    if ( map.containsKey(w)) map[w] = map[w]!! + 1
                    else map[w] = 1
                }
            }
        }
        if (word.toString() != "") {
            if ( map.containsKey(word.toString())) map[word.toString()] = map[word.toString()]!! + 1
            else map[word.toString()] = 1
        }

        banned.forEach {
            if (map.containsKey(it)) map.remove(it)
        }

        map.forEach { k,v ->
            if (v > max) {
                max = v
                key = k
            }
        }

        return key
    }
}