package ru.job4j.grouping;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {

    public static Map<String, Set<String>> sections(List<StudentGroup> students) {
        return students.stream().flatMap(e -> {
            List<Holder> holder = new ArrayList<>();
            for (String section : e.getUnits()) {
                holder.add(new Holder(section, e.getName()));
            }
            return holder.stream();
        }).collect(Collectors.groupingBy(t -> t.key, Collector
                .of(HashSet::new, (set, el) -> set.add(el.value), (left, right) -> {
                    left.addAll(right);
                    return left;
                })));
    }
}
