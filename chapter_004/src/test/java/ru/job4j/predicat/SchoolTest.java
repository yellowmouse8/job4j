package ru.job4j.predicat;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class SchoolTest {
    private School school = new School();
    Student st1 = new Student("Alien", 10);
    Student st2 = new Student("Fisher", 20);
    Student st3 = new Student("Bush", 30);
    Student st4 = new Student("Fox", 40);
    Student st5 = new Student("Dumble", 50);
    Student st6 = new Student("Rowel", 60);
    Student st7 = new Student("Kimelle", 70);
    Student st8 = new Student("Vesper", 80);
    Student st9 = new Student("Packer", 90);
    Student st10 = new Student("Wick", 100);
    private List<Student> list = List.of(st1, st2, st3, st4, st5, st6, st7, st8, st9, st10);

    @Test
    public void classA() {
        List<Student> expected = List.of(st7, st8, st9, st10);
        assertThat(this.school.collect(list, student -> student.getScore() >= 70), is(expected));
    }

    @Test
    public void classB() {
        List<Student> expected = List.of(st5, st6, st7);
        assertThat(this.school.collect(list, student -> {
            int score = student.getScore();
            return score <= 70 && score >= 50;
        }), is(expected));
    }

    @Test
    public void classC() {
        List<Student> expected = List.of(st1, st2, st3, st4, st5);
        assertThat(this.school.collect(list, student -> student.getScore() <= 50), is(expected));
    }

    @Test
    public void convertTest() {
        Map<String, Student> expected = new HashMap<>();
        expected.put(st1.getSurname(), st1);
        expected.put(st2.getSurname(), st2);
        expected.put(st3.getSurname(), st3);
        expected.put(st4.getSurname(), st4);
        expected.put(st5.getSurname(), st5);
        expected.put(st6.getSurname(), st6);
        expected.put(st7.getSurname(), st7);
        expected.put(st8.getSurname(), st8);
        expected.put(st9.getSurname(), st9);
        expected.put(st10.getSurname(), st10);
        assertThat(this.school.convertMap(list), is(expected));
    }

    @Test
    public void levelOfNull() {
        List<Student> tmp = new ArrayList<>(list);
        tmp.add(1, null);
        tmp.add(8, null);
        List<Student> expected = List.of(st10, st9, st8, st7, st6);
        assertThat(this.school.levelOf(tmp), is(expected));
    }
}
