package map_2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings) {
            String key = str.substring(0, 1);
            String value = map.getOrDefault(key, "");
            map.put(key, value + str);
        }
        return map;
    }
}
