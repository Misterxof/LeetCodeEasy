package th_th_th_z_Find_the_Original_Typed_String;

import static java.lang.Character.valueOf;

public class FindOriginalTypedStringJ {
    int possibleStringCount(String word) {
        int counter = 1;
        char prev = (char) 0;

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == prev) counter++;
            else prev = word.charAt(i);
        }

        return counter;
    }
}
