package o_o_e_Pascals_Triangle

class PascalsTriangle {
    fun generate(numRows: Int): List<List<Int>> {
        val result: MutableList<MutableList<Int>> = MutableList(numRows){ mutableListOf<Int>() }
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
        
        return result
    }
}

fun main(args: Array<String>)  {
    PascalsTriangle().generate(5)
}