package pairmatching.domain;

import java.util.ArrayList;
import java.util.List;

public class Mission {
    private final String course;
    private final String level;
    private final String name;

    public Mission(String a, String b, String c) {
        course = a;
        level = b;
        name = c;
    }

    List<List<String>> pairs = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getLevel() {
        return level;
    }

    public List<List<String>> getPairs() {
        return pairs;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Mission)) {
            return false;
        }
        Mission mission = (Mission) o;
        return name.equals(mission.name) && course.equals(mission.course);
    }
}