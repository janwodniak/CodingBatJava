package functional_2;

import java.util.List;

public class NoLong {

    public List<String> noLong(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() < 4)
                .toList();
    }
}
