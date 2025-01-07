package o_f_z_e_String_Matching_Array

class StringMatchingArray {
    fun stringMatching(words: Array<String>): List<String> {
        val res = hashSetOf<String>()

        for (i in words.indices) {
            for (j in words.indices) {
                if (i != j && words[i].length < words[j].length) {
                    if (words[j].contains(words[i])) res.add(words[i])
                }
            }
        }

        return res.toList()
    }
}