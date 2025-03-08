package t_th_se_n_Minimum_Recolors_Get_Consecutive_Black_Blocks

class MinimumRecolorsGetConsecutiveBlackBlocks {
    fun minimumRecolors2(blocks: String, k: Int): Int {
        val set = HashSet<Int>()
        var end = blocks.length - k
        var count = 0

        for (i in 0..blocks.lastIndex - k) {
            count = 0
            for (j in i..blocks.lastIndex - end) {
                if (blocks[j] == 'W') count++
            }
            set.add(count)
            end--
        }

        if (set.isEmpty()) {
            blocks.map { if (it == 'W') count++ }
            return count
        }

        return set.min()
    }

    fun minimumRecolors(blocks: String, k: Int): Int {
        var left = 0
        var right = 0
        var white = 0
        var black = 0
        var min = Int.MAX_VALUE

        while (right < blocks.length) {
            if (blocks[right] == 'W') white++
            else black++

            if (black + white == k) {
                min = minOf(min, white)

                if (blocks[left] == 'W') white--
                else black--

                left++
            }

            right++
        }

        return min
    }
}