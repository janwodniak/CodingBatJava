package functional_2;

import java.util.List;

public class No34 {

    public List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() != 3 && s.length() != 4)
                .toList();
    }
}
