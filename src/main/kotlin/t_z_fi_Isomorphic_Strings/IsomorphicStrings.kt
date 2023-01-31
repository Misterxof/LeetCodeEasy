package t_z_fi_Isomorphic_Strings


class IsomorphicStrings {
    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val first = initList(s)
        val second = initList(t)

        return first == second
    }

    private fun initList(s: String): List<Int>{
        var first: HashMap<Char, Int> = hashMapOf()
        var second: MutableList<Int> = mutableListOf()

        s.toCharArray().forEachIndexed { i, it ->
            if (!first.containsKey(it)) {
                first[it] = i
            }
            second.add(first[it]!!)
        }

        return second
    }
}

fun main(args: Array<String>) {
    println("true "+IsomorphicStrings().isIsomorphic("egg","add"))
    println("false " +IsomorphicStrings().isIsomorphic("foo","bar"))
    println("true "+IsomorphicStrings().isIsomorphic("paper","title"))
    println("false " +IsomorphicStrings().isIsomorphic("badc","baba"))
    println("false " +IsomorphicStrings().isIsomorphic("egcd","adfd"))
    println("true "+IsomorphicStrings().isIsomorphic("bbbaaaba","bbbaaaba"))
    println("true "+IsomorphicStrings().isIsomorphic("a","a"))
    println("false " +IsomorphicStrings().isIsomorphic("bbbaaaba","aaabbbba"))
    println("false " +IsomorphicStrings().isIsomorphic("abcdefghijklmnopqrstuvwxyzva","abcdefghijklmnopqrstuvwxyzck"))
}