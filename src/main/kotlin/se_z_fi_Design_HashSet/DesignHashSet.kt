package se_z_fi_Design_HashSet

class DesignHashSet {

    private val set = BooleanArray(1000001)

    fun add(key: Int) {
        set[key] = true
    }

    fun remove(key: Int) {
        set[key] = false
    }

    fun contains(key: Int): Boolean {
        return set[key]
    }
}