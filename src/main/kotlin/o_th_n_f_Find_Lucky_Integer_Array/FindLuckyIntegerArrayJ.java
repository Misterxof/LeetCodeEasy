package o_th_n_f_Find_Lucky_Integer_Array;

public class FindLuckyIntegerArrayJ {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];

        for (int i : arr)
            freq[i]++;

        for (int i = arr.length - 1; i >= 1; i--)
            if (freq[i] == i) return i;

        return -1;
    }
}
