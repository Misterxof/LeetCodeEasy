package o_fi_o_e_Water_Bottles

class WaterBottles {
    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
        if (numExchange == 0 || numBottles == 0) return 0
        
        var result = 0
        var curBottles = numBottles
        var emptyBottles = 0

        while (curBottles >= 1) {
            result += curBottles
            curBottles += emptyBottles
            emptyBottles = curBottles % numExchange
            curBottles /= numExchange
        }

        return result
    }
}

fun main() {
    println(WaterBottles().numWaterBottles(9, 3))
    println(WaterBottles().numWaterBottles(15, 4))
    println(WaterBottles().numWaterBottles(12, 4))
}