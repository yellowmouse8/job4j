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
    Address addr2 = new Address("San Antonio", "BravoStret", 12, 5);
    Profile profile1 = new Profile(addr1);
    Profile profile2 = new Profile(addr2);
    List<Profile> profileList = new ArrayList<>(List.of(profile1, profile2));

    @Test
    public void profileTest() {
        List<Address> expected = new ArrayList<>(List.of(addr1, addr2));
        assertThat(this.profiles.collect(profileList), is(expected));
    }
}
