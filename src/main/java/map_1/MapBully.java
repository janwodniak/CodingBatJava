package map_1;

import java.util.Map;
import java.util.Optional;

public class MapBully {

    public Map<String, String> mapBully(Map<String, String> map) {
        Optional.ofNullable(map.get("a")).ifPresent(a -> {
            map.put("b", a);
            map.put("a", "");
        });
        return map;
    }
}
