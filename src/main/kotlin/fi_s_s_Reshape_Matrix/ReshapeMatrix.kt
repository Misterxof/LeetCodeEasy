package fi_s_s_Reshape_Matrix

class ReshapeMatrix {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        if (mat.size * mat[0].size != r * c)    // if we can't build new matrix by provided data
            return mat

        val result: Array<IntArray> =  Array(r){ IntArray(c) }
        var ri = 0
        var ci = 0
        mat.forEachIndexed { i, it ->
            it.forEachIndexed { j, jt ->
                if (ri < r) {
                    if (ci < c) {
                        result[ri][ci] = jt
                        ci++
                    }
                    if(ci == c) {   // reached rows end
                        ci = 0
                        ri++
                    }
                }
            }
        }

        return result
    }
}

fun main(args: Array<String>) {
    println("Result:\n[1,2,3,4]\n" + ReshapeMatrix().matrixReshape(arrayOf(intArrayOf(1,2), intArrayOf(3,4)), 4, 1))
    println("Result:\n[1,2,3,4]\n" + ReshapeMatrix().matrixReshape(arrayOf(intArrayOf(1,2), intArrayOf(3,4)), 1, 4))
    println("Result:\n[same]\n" + ReshapeMatrix().matrixReshape(arrayOf(intArrayOf(1,2), intArrayOf(3,4)), 2, 4))
}