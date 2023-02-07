package se_th_th_Flood_Fill

class FloodFill {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        if (image[sr][sc] == color) return image

        var image = image
        var oldColor = image[sr][sc]

        image[sr][sc] = color
        fill(image, sr, sc, color, oldColor)

        return image
    }

    fun fill(image: Array<IntArray>, sr: Int, sc: Int, color: Int, oldColor: Int) {
        var image = image

        if (0 <= sr && sr <= image.size - 1 && 0 <= sc && sc <= image[sr].size - 1) {

            image[sr][sc] = color
            if (sr - 1 >= 0 && image[sr - 1][sc] == oldColor)
                fill(image, sr - 1, sc, color, oldColor)
            if (sr + 1 <= image.size - 1 && image[sr + 1][sc] == oldColor)
                fill(image, sr + 1, sc, color, oldColor)
            if (sc - 1 >= 0 && image[sr][sc - 1] == oldColor)
                fill(image, sr, sc - 1, color, oldColor)
            if (sc + 1 <= image[sr].size - 1 && image[sr][sc + 1] == oldColor)
                fill(image, sr, sc + 1, color, oldColor)
        }
    }
}

fun main() {
    val mat = FloodFill().floodFill(
        arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 1, 0),
            intArrayOf(1, 0, 1)
        ), 1, 1, 2
    )

    mat.forEach {
        println(it.joinToString())
    }
}