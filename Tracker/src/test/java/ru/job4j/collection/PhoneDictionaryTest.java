package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PhoneDictionaryTest {
    @Test
    public void findByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Pavel", "Shah", "+9943434", "Moscow"));
        ArrayList<Person> persons = phones.find("Shah");
        assertThat(persons.get(0).getName(), is("Pavel"));
    }
}
