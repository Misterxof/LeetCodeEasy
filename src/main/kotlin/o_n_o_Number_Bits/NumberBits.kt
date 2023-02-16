package o_n_o_Number_Bits

class NumberBits {
    fun hammingWeight(n:Int):Int {
        return Integer.bitCount(n)
    }
}

fun main() {
    println(NumberBits().hammingWeight(1011))
}