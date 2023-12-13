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


    public boolean hasMission(Mission mission) {
        return missions.has(mission);
    }

    public void addMission(String input) {
        missions.add(input);
    }

    public List<List<String>> toDto(String course, String level, String missionName) {
        Mission mission = missions.get(new Mission(course, level, missionName));
        return mission.getPairs();
    }
}