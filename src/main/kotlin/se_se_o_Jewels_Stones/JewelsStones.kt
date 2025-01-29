package se_se_o_Jewels_Stones

class JewelsStones {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val jewel = HashSet<Char>()
        var res = 0

        jewels.forEach { jewel.add(it) }

        stones.forEach {
            if (jewel.contains(it)) res++
        }

        return res
    }
}