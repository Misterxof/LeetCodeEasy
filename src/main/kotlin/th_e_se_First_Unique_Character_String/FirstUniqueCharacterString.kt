package th_e_se_First_Unique_Character_String

class FirstUniqueCharacterString {
    fun firstUniqChar(s: String): Int {
        val map: MutableMap<Char, Int> = mutableMapOf()
        val banned: MutableMap<Char, Int> = mutableMapOf()

        s.forEachIndexed { i, it ->
            if (map.containsKey(it)) {
                map.remove(it)
                banned[it] = 0
            }
            else {
                if (!banned.containsKey(it))
                    map[it] = i
            }
        }

        return if (map.isNotEmpty()) map.entries.first().value else -1
    }
}

fun main() {
//    println(FirstUniqueCharacterString().firstUniqChar("leetcode"))
//    println(FirstUniqueCharacterString().firstUniqChar("loveleetcode"))
//    println(FirstUniqueCharacterString().firstUniqChar("aabb"))
    println(FirstUniqueCharacterString().firstUniqChar("aadadaad"))
}