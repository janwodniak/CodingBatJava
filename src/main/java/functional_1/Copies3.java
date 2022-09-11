package functional_1;

import java.util.List;

public class Copies3 {

    public List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s.repeat(3));
        return strings;
    }
}
