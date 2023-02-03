package se_z_Climbing_Stairs

class ClimbingStairs {
    fun climbStairs(n: Int): Int {
        var result = IntArray(n)
        result[0] = 1
        result[1] = 2

        for (i in 2 until n) {
            result[i] = result[i - 2] + result[i - 1]
        }

        return result[n - 1]
    }
}

fun main() {
//    println(ClimbingStairs().climbStairs(2))
//    println(ClimbingStairs().climbStairs(3))
//    println(ClimbingStairs().climbStairs(4))
//    println(ClimbingStairs().climbStairs(5))
//    println(ClimbingStairs().climbStairs(6))
    println(ClimbingStairs().climbStairs(7))
}