package se_z_s_Design_HashMap

class DesignHashMap {

    private val map = IntArray(1000001)
    private val set = BooleanArray(1000001)

    fun put(key: Int, value: Int) {
        map[key] = value
        set[key] = true
    }

    fun get(key: Int): Int {
        return if (set[key]) return map[key]
        else -1
    }

    fun remove(key: Int) {
        map[key] = -1
        set[key] = false
    }
}