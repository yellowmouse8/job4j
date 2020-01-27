package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ProfileTest {
    private Profiles profiles = new Profiles();
    Address addr1 = new Address("San Diego", "Parklane Street", 4, 24);
    Address addr2 = new Address("San Antonio", "BravoStreet", 12, 5);
    Address addr3 = new Address("Sacramento", "Westside Park", 13, 6);
    Address addr4 = new Address("San Diego", "Parklane Street", 4, 24);
    Profile profile1 = new Profile(addr1);
    Profile profile2 = new Profile(addr2);
    Profile profile3 = new Profile(addr3);
    Profile profile4 = new Profile(addr4);

    @Test
    public void mainProfileTest() {
        List<Profile> list = new ArrayList<>(List.of(profile1, profile2));
        List<Address> expected = new ArrayList<>(List.of(addr1, addr2));
        assertThat(this.profiles.collect(list), is(expected));
    }

    @Test
    public void unicAddress() {
        List<Profile> prof = new ArrayList<>(List.of(profile1, profile2, profile3, profile4));
        List<Address> expected = new ArrayList<>(List.of(addr1, addr2, addr3));
        assertThat(this.profiles.collect(prof), is(expected));
    }
}
