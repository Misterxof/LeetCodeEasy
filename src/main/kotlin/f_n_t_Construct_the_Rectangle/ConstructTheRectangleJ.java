package f_n_t_Construct_the_Rectangle;

import java.util.HashMap;

public class ConstructTheRectangleJ {
    public int[] constructRectangle(int area) {
        if (area <= 1) return new int[]{area, area};

        HashMap<Integer, Pair<Integer, Integer>> divs = new HashMap<>();
        var min = Integer.MAX_VALUE;

        for (int w = 1; w <= Math.sqrt(area); w++) {
            if (area % w == 0) {
                int l = area / w;
                if (l >= w) {
                    divs.put(l - w, new Pair<>(l, w));
                    if (l - w < min) min = l - w;
                }
            }
        }

        return new int[]{divs.get(min).first, divs.get(min).second};
    }

    public class Pair<A, B> {
        public final A first;
        public final B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }
    }
}
