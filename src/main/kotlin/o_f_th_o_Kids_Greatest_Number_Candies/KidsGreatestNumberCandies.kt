package o_f_th_o_Kids_Greatest_Number_Candies

class KidsGreatestNumberCandies {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = candies.max()
        var result = mutableListOf<Boolean>()

        for (i in candies.indices) {
            result.add(candies[i] + extraCandies >= max!!)
        }

        return result
    }
}

fun main() {
    println(KidsGreatestNumberCandies().kidsWithCandies(intArrayOf(2,3,5,1,3), 3))
}