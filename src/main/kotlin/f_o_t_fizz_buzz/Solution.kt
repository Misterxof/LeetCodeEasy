package f_o_t_fizz_buzz

class Solution {
    fun fizzBuzz(n: Int): List<String> {
        var result: MutableList<String> = mutableListOf()

        for  (i in 1..n){
            result += when{ // += LeetCode error use add instead
                (i % 5 == 0) && (i % 3 == 0) -> "FizzBuzz"

                (i % 3 == 0) -> "Fizz"

                (i % 5 == 0) -> "Buzz"

                else -> "$i"
            }
        }
        return result
    }
}