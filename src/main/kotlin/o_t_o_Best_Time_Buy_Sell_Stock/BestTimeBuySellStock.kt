package o_t_o_Best_Time_Buy_Sell_Stock

class BestTimeBuySellStock {
    fun maxProfit(prices: IntArray): Int {
        val boughts = IntArray(prices.size)
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        var result = 0

        for (i in prices.indices) {
            if (prices[i] < min) {
                min = prices[i]
                max = 0
            }

            if (prices[i] >= max) {
                max = prices[i]
              //  boughts[i] = max - min
                result = maxOf(result, max - min)
            }
        }

        return  result
    }
}

fun main(args: Array<String>) {
    println(BestTimeBuySellStock().maxProfit(intArrayOf(7,1,5,3,6,4)))
    println(BestTimeBuySellStock().maxProfit(intArrayOf(7,6,4,3,1)))
    println(BestTimeBuySellStock().maxProfit(intArrayOf(2,4,1)))
    println(BestTimeBuySellStock().maxProfit(intArrayOf(2,1,2,1,0,1,2)))
    println(BestTimeBuySellStock().maxProfit(intArrayOf(3,3,5,0,0,3,1,4)))
}