package functional_1;

import java.util.List;

public class MoreY {

    public List<String> moreY(List<String> strings) {
        strings.replaceAll("y%sy"::formatted);
        return strings;
    }
}
