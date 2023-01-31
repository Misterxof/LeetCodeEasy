package t_z_fi_Isomorphic_Strings


class IsomorphicStrings {

//    fun isIsomorphic(s: String, t: String): Boolean {
//        if (s.length != t.length) return false
////        println("$s $t")
//        println(s.zip(t).toSet().size.run { equals(s.toSet().size) && equals(t.toSet().size) })
//        println(s.toSet())
//        println(t.toSet())
//        println(equals(t.toSet().size) && equals(s.toSet().size))
//
//        return s == t
//    }
    fun isIsomorphic2(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        var s = s
        var builderLeftChars = t
        val builder = t.toCharArray()

        builder.forEachIndexed() { index, character ->
            if (builderLeftChars.contains(character)){
                s = s.replace(s[index].toString(), character.toString())
                builderLeftChars = builderLeftChars.replace(character.toString(), "")
                println("bl=$builderLeftChars s=$s b=$character")
            }
        }

        return s == t
    }

    fun isIsomorphic3(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        var first: HashMap<Char, Int> = hashMapOf()
        var second: HashMap<Char, Int> = hashMapOf()
        var prevCharacter = ' '

        s.toSet()
        s.toCharArray().forEach {
            if (first.containsKey(it) && prevCharacter == it) {
                first.computeIfPresent(it) { k, v -> v + 1 }
                println(prevCharacter)
            }
            else {
                first[it] = 1
            }
            prevCharacter = it
        }

        prevCharacter = ' '
        t.toCharArray().forEach {
            if (second.containsKey(it) && prevCharacter == it)
                second.computeIfPresent(it){k,v-> v+1}
            else
                second[it] = 1
            prevCharacter == it
        }

        println("$s $t")
        println(first)
        println(second)
        return first.size == second.size
    }

    fun isIsomorphic5(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        var first: MutableList<String> = mutableListOf()
        var second: MutableList<String> = mutableListOf()

        addToList(s, first)
        addToList(t, second)
//        println("$s $t")
//        println(first)
//        println(second)
//        println(first.toSet())
//        println(second.toSet())
//        println(first.zip(second).toSet())
//        println(first.zip(second).toSet().size)
//        println(first.size)
        var st:  MutableSet<Pair<String, String>> = mutableSetOf()
        first.zip(second).toSet().forEach {
            if (it.first != it.second)
                st.add(it.first to it.second)
        }
        println(st)

        if (first.size != second.size) return false
        if (st.size > 0) return false


        return first.toSet().size == second.toSet().size
    }

    fun isIsomorphic23(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        var first: HashMap<Char, Int> = hashMapOf()
        var second: HashMap<Char, Int> = hashMapOf()

        s.toSet()
        s.toCharArray().forEach {
            if (first.containsKey(it)) {
                first.computeIfPresent(it) { k, v -> v + 1 }
            }
            else {
                first[it] = 1
            }
        }

        t.toCharArray().forEach {
            if (second.containsKey(it) )
                second.computeIfPresent(it){k,v-> v+1}
            else
                second[it] = 1
        }

        println("$s $t")
        println(first)
        println(second)
        println(s.zip(t).size)
        println(s.zip(t).toSet().size)
        println(s.zip(t))
        println(s.zip(t).toSet())
        println(s.toSet())
        println(t.toSet())
        if (first.size != second.size) return false
        var st:  MutableSet<Pair<Char, Char>> = mutableSetOf()
        s.zip(t).toSet().forEach {
            if (it.first != it.second)
                st.add(it.first to it.second)
        }
        println(st)

        return first.size == second.size
    }

    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val first = initList(s)
        val second = initList(t)

        //println(first == second)

        return first == second
    }

    private fun initList(s: String): List<Int>{
        var first: HashMap<Char, Int> = hashMapOf()
        var second: MutableList<Int> = mutableListOf()

        s.toCharArray().forEachIndexed() { i, it ->
            if (!first.containsKey(it)) {
                first[it] = i
            }
            second.add(first[it]!!)
        }

        return second
    }

    private fun addToList(s: String,list: MutableList<String>) {
        var prevCharacter = ' '
        var counter = 0

        s.toCharArray().forEachIndexed { i, it ->
            if (i == 0) prevCharacter = it

            if (prevCharacter != it){
                list.add("$counter$prevCharacter")
                prevCharacter = it
                counter = 1
            } else {
                counter++
            }

            if (i == s.length-1)
                list.add("$counter$prevCharacter")
        }
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