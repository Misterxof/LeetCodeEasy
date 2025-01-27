package t_n_z_Word_Pattern

import java.util.HashMap

class WordPattern {
    fun wordPattern(pattern: String, s: String): Boolean {
        val maps = HashMap<String, Char>()
        val strings = s.split(" ")

        if (pattern.length != strings.size) return false

        for (i in strings.indices) {
            if (!maps.containsKey(strings[i]) && !maps.containsValue(pattern[i])) {
                maps[strings[i]] = pattern[i]
            } else {
                if (maps[strings[i]] != pattern[i]) return false
            }
        }

        return true
    }
}