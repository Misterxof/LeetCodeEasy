package se_n_s_Rotate_String

class RotateString {
    fun rotateString(s: String, goal: String): Boolean {
        if (s.length != goal.length) return false
        return (s + s).contains(goal)
    }
}