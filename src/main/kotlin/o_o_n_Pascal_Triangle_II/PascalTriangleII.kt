package o_o_n_Pascal_Triangle_II


class PascalTriangleII {
    fun getRow(rowIndex: Int): List<Int> {
        val result: MutableList<MutableList<Int>> = MutableList(rowIndex + 1 ){ mutableListOf<Int>() }
        var column = 0

        result.forEachIndexed { i, it ->
            column++
            for (j in 0 until column)  {
                if (j == 0 || j == column - 1) {
                    result[i].add(j, 1)
                    continue
                }

                result[i].add(j, result[i-1][j-1] + result[i-1][j])
            }
        }

        return result[rowIndex]
    }
}

fun main(args: Array<String>)  {
    println(PascalTriangleII().getRow(3))
}