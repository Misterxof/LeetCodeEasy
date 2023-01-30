package o_s_se_t_Richest_Customer_Wealth

class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var maxWealth = 0
        accounts.forEach {
            var wealth = it.sum()
            if (wealth > maxWealth)
                maxWealth = wealth
        }
        return maxWealth
    }
}