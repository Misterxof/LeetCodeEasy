package fi_fi_o_Student_Attendance_RecordI

class StudentAttendanceRecordI {
    fun checkRecord(s: String): Boolean {
        var ac = 0
        var c = 0

        s.forEach {
            if (c != 0 && it != 'L') c = 0
            if (it == 'A') {
                println("dsdd")
                ac++
                if (ac == 2) return false
            }
            if (it == 'L') {
                c++
                if (c == 3) return false
            }
        }

        return true
    }
}