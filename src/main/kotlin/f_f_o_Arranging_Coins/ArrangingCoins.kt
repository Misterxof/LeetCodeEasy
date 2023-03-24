package f_f_o_Arranging_Coins

class ArrangingCoins {
    fun arrangeCoins(n: Int): Int {
        var stairs = 1
        var n = n

        while (n - stairs > 0)
            n -= stairs++

        return if (n < stairs) --stairs else stairs
    }
}

fun main() {
    println(ArrangingCoins().arrangeCoins(8))
    println(ArrangingCoins().arrangeCoins(5))
}