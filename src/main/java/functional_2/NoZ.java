package functional_2;

import java.util.List;

public class NoZ {

    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .toList();
    }
}
