package s_se_Add_Binary

import java.math.BigInteger

class AddBinary {
    fun addBinary(a: String, b: String): String {
        return (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)
    }
}

fun main() {
    println(AddBinary().addBinary("11", "1"))
    println(AddBinary().addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"))
}