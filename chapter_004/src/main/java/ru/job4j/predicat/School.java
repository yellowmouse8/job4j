package ru.job4j.predicat;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }

    Map<String, Student> convertMap(List<Student> students) {
        return students.stream().distinct().collect(Collectors.toMap(Student::getSurname, student -> student));
    }
}
