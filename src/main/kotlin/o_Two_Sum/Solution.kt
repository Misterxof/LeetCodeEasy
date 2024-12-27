package o_Two_Sum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { firstIndex, first ->
            nums.forEachIndexed { secondIndex, second ->
                if (secondIndex != firstIndex){
                    if (first + second == target)
                        return intArrayOf(firstIndex, secondIndex)
                }
            }
        }
        return intArrayOf(0)
    }

    fun twoSum2(nums: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int, Int>()

        nums.forEachIndexed { index, i -> hashMap.putIfAbsent(index, i) }

        hashMap.forEach { pair ->
            val targetValue = target - pair.value
            if (hashMap.containsValue(targetValue)) {
//                val index = hashMap.entries.find { entry -> entry.value == targetValue && entry.key != pair.key}!!.key
                val index = hashMap.getKey(targetValue, pair.key)
                if (index != null)
                    return intArrayOf(pair.key, index)
            }
        }

        return intArrayOf()
    }
    
    // the best
    fun twoSum3(nums: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int, Int>()

        nums.forEachIndexed { index, i ->
            val targetKey = target - i
            if (hashMap.containsKey(targetKey))
                return intArrayOf(hashMap[targetKey]!!, index)
            hashMap[i] = index
        }

        return intArrayOf()
    }

    fun <K,V> HashMap<K, V>.getKey(searchValue: V, avoidKey: K): K? {
        this.entries.forEach { entry ->
            println("k ${entry.key} v ${entry.value} sv $searchValue ak $avoidKey")
            if (entry.value == searchValue && entry.key != avoidKey) {
                println(entry.key)
                return entry.key
            }
        }
        return null
    }
}