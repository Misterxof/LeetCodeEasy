package s_n_SqrtX

class SqrtX {

    // Odd number subtraction method
    fun mySqrt2(x: Int): Int {
        var oddNumber = 1
        var sqrt = 0
        var x = x

        while (true) {
            if (x - oddNumber >= 0) {
                sqrt++
                x -= oddNumber
                oddNumber += 2
            } else return sqrt
        }

        return sqrt
    }

    // binary search
    fun mySqrt(x: Int): Int {
        var middle: Int
        var left = 1
        var right = x

        while (left <= right) {
            middle = (left + right) / 2

            if (x / middle == middle) return middle
            else if (middle > x / middle) right = middle - 1
            else left = middle + 1
        }

        return right
    }
}

fun main() {
    println(SqrtX().mySqrt(8))
}