package ru.job4j.singleton;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.After;
import ru.job4j.poly.TrackerEagerLoad;
import ru.job4j.poly.TrackerInner;
import ru.job4j.poly.TrackerSingleTon;
import ru.job4j.start.Tracker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class SingleTonTest {

    @Test
    public void whenOneSingleTon() {

        TrackerSingleTon trackerSingleTon = TrackerSingleTon.ADD;
        TrackerEagerLoad trackerEagerLoad = TrackerEagerLoad.getEagerLoad();
        assertThat(trackerSingleTon.findAll(), is(trackerEagerLoad.findAll()));

    }
}