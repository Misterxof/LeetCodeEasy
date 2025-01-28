package fi_se_fi_Distribute_Candies

class DistributeCandies {
    fun distributeCandies(candyType: IntArray): Int {
        val total = candyType.size / 2
        val types = HashSet<Int>()

        candyType.forEach { types.add(it) }

        return if (types.size <= total) types.size else total
    }
}