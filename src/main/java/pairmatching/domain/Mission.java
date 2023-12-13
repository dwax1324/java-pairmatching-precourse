package pairmatching.domain;

import java.util.List;

public class Mission {
    private String name;
    private String course;
    private String level;

    List<List<String>> pairs;

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getLevel() {
        return level;
    }
}
