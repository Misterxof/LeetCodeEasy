package s_fi_se_Robot_Return_Origin

class RobotReturnOrigin {
    fun judgeCircle(moves: String): Boolean {
        var x = 0
        var y = 0

        moves.forEach {
            when(it) {
                'U' -> x++
                'D' -> x--
                'L' -> y--
                'R' -> y++
            }
        }

        return x == 0 && y == 0
    }
}