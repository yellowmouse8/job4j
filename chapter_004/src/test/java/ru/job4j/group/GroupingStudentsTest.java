package ru.job4j.group;

import org.junit.Test;
import ru.job4j.grouping.Group;
import ru.job4j.grouping.StudentGroup;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GroupingStudentsTest {
    private Group group = new Group();
    StudentGroup st1 = new StudentGroup("Trevor", Set.of("Golf", "Fishing", "Driving"));
    StudentGroup st2 = new StudentGroup("Max", Set.of("Athletic", "Swimming", "Driving"));
    StudentGroup st3 = new StudentGroup("Vi", Set.of("Golf", "Baseball", "Repair"));
    StudentGroup st4 = new StudentGroup("Twin", Set.of("Athletic", "Fishing", "Lockpick"));
    StudentGroup st5 = new StudentGroup("Michael", Set.of("Shutting", "Hockey", "Repair"));
    private List<StudentGroup> student = List.of(st1, st2, st3, st4, st5);

    @Test
    public void studentsValue() {
        Map<String, Set<String>> expected = new HashMap<>() {{
            put("Golf", Set.of("Vi", "Trevor"));
            put("Hockey", Set.of("Michael"));
            put("Baseball", Set.of("Vi"));
            put("Athletic", Set.of("Max", "Twin"));
            put("Driving", Set.of("Max", "Trevor"));
            put("Lockpick", Set.of("Twin"));
            put("Swimming", Set.of("Max"));
            put("Shutting", Set.of("Michael"));
            put("Repair", Set.of("Vi", "Michael"));
            put("Fishing", Set.of("Trevor", "Twin"));
        }};
        var result = Group.sections(student);
        assertThat(result, is(expected));
    }
}
