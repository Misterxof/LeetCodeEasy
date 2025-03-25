package o_o_fi_f_Day_Year

class DayYear {
    fun dayOfYear(date: String): Int {
        val monthDays = intArrayOf(31,28,31,30,31,30,31,31,30,31,30,31)
        val dates = date.split('-').map { it.toInt() }
        var result = dates[2]

        if ((dates[0] % 4 == 0 && dates[0] % 100 != 0) || dates[0] % 400==0)
            monthDays[1] = 29

        for (i in 0 until dates[1] - 1)
            result += monthDays[i]

        return result
    }
}