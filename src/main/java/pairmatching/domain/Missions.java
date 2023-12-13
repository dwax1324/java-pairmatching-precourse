package pairmatching.domain;

import java.util.List;
import pairmatching.utils.Parser;

public class Missions {
    private List<Mission> missions;


    public void add(String input) {
        List<String> parsed = Parser.parseStringByDelimiter(input, ",");

    }


    boolean has(String name) {
        return missions.stream().anyMatch(r -> r.getName().equals(name));
    }
}
