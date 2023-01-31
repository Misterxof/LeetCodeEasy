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

    fun isIsomorphicSecond(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val unitedSize = s.zip(t).toSet().size
        val sSize = s.toSet().size
        val tSize = t.toSet().size

        return sSize == tSize && sSize == unitedSize
    }
}

fun main(args: Array<String>) {
    println("true "+IsomorphicStrings().isIsomorphicSecond("egg","add"))
    println("false " +IsomorphicStrings().isIsomorphicSecond("foo","bar"))
    println("true "+IsomorphicStrings().isIsomorphicSecond("paper","title"))
    println("false " +IsomorphicStrings().isIsomorphicSecond("badc","baba"))
    println("false " +IsomorphicStrings().isIsomorphicSecond("egcd","adfd"))
    println("true "+IsomorphicStrings().isIsomorphicSecond("bbbaaaba","bbbaaaba"))
    println("true "+IsomorphicStrings().isIsomorphicSecond("a","a"))
    println("false " +IsomorphicStrings().isIsomorphicSecond("bbbaaaba","aaabbbba"))
    println("false " +IsomorphicStrings().isIsomorphicSecond("abcdefghijklmnopqrstuvwxyzva","abcdefghijklmnopqrstuvwxyzck"))
}