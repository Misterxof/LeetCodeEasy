package s_s_o_Image_Smoother;

public class ImageSmootherJ {
    public int[][] imageSmoother(int[][] img) {
        int[][] res = new int[img.length][img[0].length];

        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                int count = 0;
                int num = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++)
                        if (k >= 0 && k < img.length && l >= 0 && l < img[0].length) {
                            count += img[k][l];
                            num++;
                        }
                }
                res[i][j] = count / num;
            }
        }

        return res;
    }
}
