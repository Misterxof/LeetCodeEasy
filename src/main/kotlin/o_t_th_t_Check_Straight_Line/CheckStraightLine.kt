package o_t_th_t_Check_Straight_Line

class CheckStraightLine {
    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
        if (coordinates.size > 2) {
            for (i in 2 until coordinates.size)
                if (((coordinates[i][0] - coordinates[0][0]) * (coordinates[1][1] - coordinates[0][1])) !=
                    ((coordinates[i][1] - coordinates[0][1]) * (coordinates[1][0] - coordinates[0][0]))
                ) return false

            return true
        } else return true
    }
}