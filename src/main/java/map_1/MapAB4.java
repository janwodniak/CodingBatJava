package map_1;

import java.util.Map;

public class MapAB4 {

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String a = map.get("a");
            String b = map.get("b");
            if (a.length() > b.length()) {
                map.put("c", a);
            } else if (a.length() < b.length()) {
                map.put("c", b);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}
