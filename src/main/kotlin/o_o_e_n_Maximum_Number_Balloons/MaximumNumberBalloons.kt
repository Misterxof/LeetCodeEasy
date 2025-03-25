package o_o_e_n_Maximum_Number_Balloons

class MaximumNumberBalloons {
    fun maxNumberOfBalloons(text: String): Int {
        val map = hashMapOf('b' to 0, 'a' to 0, 'l' to 0, 'o' to 0, 'n' to 0)
        var min = Int.MAX_VALUE

        text.forEach {
            if (map.containsKey(it))
                map[it] = map[it]!! + 1
        }

        map.forEach {
            if (it.key == 'l' || it.key == 'o')
                min = minOf(min, it.value / 2)
            else min = minOf(min, it.value)
        }

        return min
    }
}