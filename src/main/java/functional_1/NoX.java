package functional_1;

import java.util.List;

public class NoX {

    public List<String> noX(List<String> strings) {
        return strings.stream()
                .map(s -> s.replace("x", ""))
                .toList();
    }
}
