package o_t_z_se_Unique_Number_Occurrences

class UniqueNumberOccurrences {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = HashMap<Int, Int>()
        val set = HashSet<Int>()

        arr.forEach {
            map[it] = map.getOrPut(it) { 0 } + 1
        }

        map.forEach { (k, v) -> if (!set.add(v)) return false }

        return true
    }
}