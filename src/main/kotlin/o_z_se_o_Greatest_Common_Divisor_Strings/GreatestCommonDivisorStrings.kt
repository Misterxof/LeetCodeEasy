package o_z_se_o_Greatest_Common_Divisor_Strings

class GreatestCommonDivisorStrings {
    // mine
    fun gcdOfStrings(str1: String, str2: String): String {
        var zip = str1.zip(str2)
        var maxDivisor = ""
        var max = ""

        zip.forEachIndexed { i, pair ->
            if (pair.first == pair.second)
                maxDivisor += pair.first

            if (str1.replace(maxDivisor, "").isBlank() && str2.replace(maxDivisor, "").isBlank())
                max = maxDivisor
        }
        return max
    }

    // found cool stuff
    fun gcdOfStrings2(str1: String, str2: String): String {
        // Check if gcd exists
        if (str1 + str2 != str2 + str1) {
            return ""
        }

        // Count gcd of string lengths
        var l1 = str1.length
        var l2 = str2.length
        while (l1 != l2) {
            if (l1 > l2) l1 -= l2
            else l2 -= l1

            println("$l1 $l2")
        }

        return str1.substring(0, l1)
    }
}

fun main(args: Array<String>) {
   println("Result:\nABAB \n" + GreatestCommonDivisorStrings().gcdOfStrings("ABABABAB", "ABAB"))
   println("Result:\nABC \n" + GreatestCommonDivisorStrings().gcdOfStrings("ABCABC", "ABC"))
   println("Result:\nAB \n" + GreatestCommonDivisorStrings().gcdOfStrings("ABABAB", "ABAB"))
   println("Result:\nNULL \n" + GreatestCommonDivisorStrings().gcdOfStrings("LEET", "CODE"))
   println("Result:\nNULL \n" + GreatestCommonDivisorStrings().gcdOfStrings("ABCDEF", "ABC"))
   println("Result:\nTAUXX \n" + GreatestCommonDivisorStrings().gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"))
}