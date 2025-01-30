package e_fi_n_Buddy_Strings

class BuddyStrings {
    fun buddyStrings(s: String, goal: String): Boolean {
        if (s.length != goal.length) return false

        val list = mutableListOf<Pair<Char, Char>>()

        for (i in s.indices) {
            if (s[i] != goal[i]) list.add(s[i] to goal[i])
            if (list.size > 2) return false
        }

        return when (list.size) {
            0 -> return s.length != s.toSet().size
            2 -> return list[0].first == list[1].second && list[0].second == list[1].first
            else -> return false
        }
    }
}