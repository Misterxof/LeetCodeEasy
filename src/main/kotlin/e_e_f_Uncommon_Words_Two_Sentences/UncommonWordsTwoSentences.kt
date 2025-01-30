package e_e_f_Uncommon_Words_Two_Sentences

class UncommonWordsTwoSentences {
    fun uncommonFromSentences(s1: String, s2: String): Array<String> {
        val map = HashMap<String, Int>()
        val result = mutableListOf<String>()

        s1.split(" ").forEach {
            if (map.containsKey(it)) map[it] = map[it]!! + 1
            else map[it] = 1
        }

        s2.split(" ").forEach {
            if (map.containsKey(it)) map[it] = map[it]!! + 1
            else map[it] = 1
        }

        map.forEach { k,v -> if (v == 1) result.add(k) }

        return result.toTypedArray()
    }
}