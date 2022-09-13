package map_2;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {

    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            String substring = string.substring(0, 1);
            if (map.containsKey(substring)) {
                int index = map.get(substring);
                if (index != -1) {
                    swap(strings, i, index);
                    map.put(substring, -1);
                }

            } else {
                map.put(substring, i);
            }
        }
        return strings;
    }

    private void swap(String[] strings, int i, int index) {
        String temp = strings[index];
        strings[index] = strings[i];
        strings[i] = temp;
    }
}
