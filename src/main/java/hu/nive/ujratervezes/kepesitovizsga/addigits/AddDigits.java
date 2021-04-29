package hu.nive.ujratervezes.kepesitovizsga.addigits;

import java.util.HashMap;
import java.util.Map;

public class AddDigits {

    public static int addDigits(String input) {

        String s = "alma";
        Map<Integer, Integer> addDigits;
        addDigits = new HashMap<>();
        for (int i: s.toCharArray()) {
            if (addDigits.containsKey(i)) {
                addDigits.put(i, addDigits.get(i) + 1);
            }
            else {
                addDigits.put(i, 1);
            }
        }
        System.out.println(addDigits);
        int numberOfM;

        return 0;
    }
}
