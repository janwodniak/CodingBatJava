package map_2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, map.containsKey(str));
        }
        return map;
    }
}
