package se_t_e_Self_Dividing_Numbers;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbersJ {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        var flag = true;

        for (int i = left; i <= right; i++) {
            int num = i;
            flag = true;
            while (num >= 1) {
                if (num % 10 != 0 && i % (num % 10) == 0) num /= 10;
                else {
                    flag = false;
                    break;
                }
            }
            if (flag) list.add(i);
        }

        return list;
    }
}
