package n_o_f_XKind_Deck_Cards

class XKindDeckCards {
    fun hasGroupsSizeX(deck: IntArray): Boolean {
        val map = HashMap<Int, Int>()
        var result = -1

        deck.forEach {
            map[it] = map.getOrPut(it) { 0 } + 1
        }

        map.forEach { k, v ->
            if (result == -1) result = v
            else {
                result = gcd(result, v)
            }
        }

        return result >= 2
    }

    fun gcd(x: Int, y: Int): Int {
        return if (x == 0) y else gcd(y % x, x)
    }
}