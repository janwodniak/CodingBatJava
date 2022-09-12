package functional_2;

import java.util.List;

public class NoYY {

    public List<String> noYy(List<String> strings) {
        return strings.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .toList();
    }
}
