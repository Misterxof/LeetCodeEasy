package o_th_th_se_The_K_Weakest_Rows_Matrix

class Solution {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        var resultList:  HashMap<Int, Int> = hashMapOf()

        mat.forEachIndexed() { index, value ->
            resultList[index] = value.sum()
        }
        resultList = resultList.toList().sortedBy { (k,v) -> v }.toMap() as HashMap<Int, Int>
        var intAr =  resultList.keys.toList().take(k).toIntArray()
        return intAr
    }
}