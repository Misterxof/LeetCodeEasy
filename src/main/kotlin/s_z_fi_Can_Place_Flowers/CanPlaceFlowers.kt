package s_z_fi_Can_Place_Flowers

class CanPlaceFlowers {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var i = 0
        var n = n

        while (n != 0 && i < flowerbed.size) {
            when {
                i == 0 && i + 1 != flowerbed.size ->  {
                    if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1
                        n--
                    }
                    i += 2
                }
                i == 0 && flowerbed.size == 1 -> {
                    if (flowerbed[i] == 0) {
                        flowerbed[i] = 1
                        n--
                    } else i++
                }
                i - 1 > 0 && i + 1 != flowerbed.size ->  {
                    if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1
                        n--
                        i += 2
                    } else i++
                }
                i == flowerbed.lastIndex && i - 1 > 0 -> {
                    if (flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
                        flowerbed[i++] = 1
                        n--
                    } else i++
                }
                else -> i++
            }
        }

        return n == 0
    }
}

fun main() {
    println(CanPlaceFlowers().canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 1))
    println(CanPlaceFlowers().canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 2))
    println(CanPlaceFlowers().canPlaceFlowers(intArrayOf(1), 2))
}