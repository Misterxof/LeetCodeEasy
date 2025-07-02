package s_s_o_Image_Smoother

class ImageSmoother {
    fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
        val res = Array<IntArray>(img.size) { IntArray(img[0].size) }

        for (i in img.indices) {
            for (j in img[0].indices) {
                var count = 0
                var num = 0
                for (k in i - 1..i + 1) {
                    for (l in j - 1..j + 1)
                        if (k >= 0 && k < img.size && l >= 0 && l < img[0].size) {
                            count += img[k][l]
                            num++
                        }
                }
                res[i][j] = count / num
            }
        }

        return res
    }
}