package se_t_e_Self_Dividing_Numbers

class SelfDividingNumbers {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val list = mutableListOf<Int>()
        var flag = true

        for (i in left..right) {
            var num = i
            flag = true
            while (num >= 1) {
                if (num % 10 != 0 && i % (num % 10) == 0) num /= 10
                else {
                    flag = false
                    break
                }
            }
            if (flag) list.add(i)
        }

        return list
    }
}