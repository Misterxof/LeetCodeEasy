package t_se_e_First_Bad_Version

class FirstBadVersion {
    fun firstBadVersion(n: Int) : Int {
        var start = 0
        var end = n
        var badVersion = 0

        while (start <= end){
            var middleIndex = (start + end) / 2

            if (isBadVersion(middleIndex)) {
                badVersion = middleIndex
                end = middleIndex - 1
            } else
                start = middleIndex + 1
        }

        return badVersion
    }

    fun isBadVersion(version: Int) : Boolean {
        return when(version) {
            in 0..3 -> false
            in 4..5 -> true
//            1 -> true
            else -> false
        }
    }
}

fun main() {
    println(FirstBadVersion().firstBadVersion(5))
    println(FirstBadVersion().firstBadVersion(1))
}