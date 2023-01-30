package o_th_th_se_The_K_Weakest_Rows_Matrix


fun main(args: Array<String>) {
    println(Solution().kWeakestRows(arrayOf(
        intArrayOf(1,0,0,0),
        intArrayOf(1,1,1,1),
        intArrayOf(1,0,0,0),
        intArrayOf(1,0,0,0)),
        2))
    println(Solution().kWeakestRows(arrayOf(
        intArrayOf(1,1,0,0,0),
        intArrayOf(1,1,1,1,0),
        intArrayOf(1,0,0,0,0),
        intArrayOf(1,1,0,0,0),
        intArrayOf(1,1,1,1,1)),
        3))
}