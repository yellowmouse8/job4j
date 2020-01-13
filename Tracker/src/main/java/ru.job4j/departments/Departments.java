package ru.job4j.departments;

import org.jetbrains.annotations.NotNull;

import javax.crypto.spec.DESedeKeySpec;
import javax.swing.text.DefaultEditorKit;
import java.util.*;
import java.util.stream.Collectors;

public class Departments {
    private Set<String> deps = new TreeSet<>();

    private static List<String> fillGaps(String[] deps) {
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i != deps.length; i++) {
            StringJoiner sj = new StringJoiner("/");
            for (int p = 0; p <= i; p++) {
                sj.add(deps[p]);
            }
            tmp.add(sj.toString());
        }
        return tmp;
    }

    public Set<String> getDeps() {
        return deps;
    }

    public void setDeps(Set<String> depo) {
        this.deps = depo;
        deps.addAll(depo.stream().map(e -> e.split("/")).distinct().map(Departments::fillGaps)
                .flatMap(List::stream)
                .collect(Collectors.toList()));
    }

    public void sortAsc() {
        Set<String> set = new TreeSet<>(Comparator.comparing((String o) -> o.split("/")[0])
                .thenComparing(o -> o));
        set.addAll(deps);
        deps = set;

    }

    public void sortDesc() {
        Set<String> set = new TreeSet<>((o1, o2) -> {
            int tipResult = o2.split("/")[0].compareTo(o1.split("/")[0]);
            return tipResult != 0 ? tipResult : o1.compareTo(o2);
        });
        set.addAll(deps);
        deps = set;
    }
}

