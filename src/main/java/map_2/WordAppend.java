package map_2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            int count = map.getOrDefault(str, 0);
            map.put(str, count + 1);
            if ((count + 1) % 2 == 0) {
                result.append(str);
            }
        }
        return result.toString();
    }
}
