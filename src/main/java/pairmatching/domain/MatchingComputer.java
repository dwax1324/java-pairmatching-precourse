package pairmatching.domain;

import java.util.List;

public class MatchingComputer {
    private List<String> frontendCrews;
    private List<String> backendCrews;

    Missions missions = new Missions();

    public MatchingComputer(List<String> a, List<String> b) {
        frontendCrews = a;
        backendCrews = b;
    }

    public boolean hasMission(String mission) {
        return missions.has(mission);
    }

    public void setMission(String input) {
        missions.add(input);
    }
}