package t_f_o_e_Sort_People

class SortPeople {
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        var steps = heights.size

        while (steps >= 1) {
            var min = -1

            for (i in heights.size - 1 downTo 0) {
                if (min < heights[i]) min = heights[i]
                else if (i + 1 != heights.size) {
                    names[i] = names[i + 1].also { names[i + 1] = names[i] }
                    heights[i] = heights[i + 1].also { heights[i + 1] = heights[i] }
                }
            }
            steps--
        }

        return names
    }
}

fun main() {
    var arr = SortPeople().sortPeople(arrayOf("Mary","John","Emma"), intArrayOf(180,165,170))
    arr.forEach { print("$it ") }
}