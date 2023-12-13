package pairmatching.domain;

import java.util.ArrayList;
import java.util.List;
import pairmatching.utils.Parser;

public class Missions {
    private final List<Mission> missions = new ArrayList<>();

    public void add(String input) {
        List<String> parsed = Parser.parseStringByDelimiter(input, ",");
        Mission newMission = new Mission(parsed.get(0), parsed.get(1), parsed.get(2));
        missions.remove(newMission);
        missions.add(newMission);
    }

    boolean has(Mission mission) {
        return missions.stream().anyMatch(r -> r.equals(mission));
    }


    public Mission get(Mission mission) {
        return missions.stream().filter(r -> r.equals(mission)).findAny().orElse(null);
    }
}