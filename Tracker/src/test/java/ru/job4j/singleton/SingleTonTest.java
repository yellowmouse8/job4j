package ru.job4j.singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.After;
import ru.job4j.poly.TrackerEagerLoad;
import ru.job4j.poly.TrackerInner;
import ru.job4j.poly.TrackerSingleTon;
import ru.job4j.poly.TrackerSingleTonLazy;
import ru.job4j.start.Tracker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class SingleTonTest {
    private static TrackerSingleTon trackerSingleTon;
    private static TrackerSingleTonLazy trackerSingleTonLazy;
    private static TrackerEagerLoad trackerEagerLoad;
    private static TrackerInner trackerInner;


    @Test
    public void whenEnumSingleTon() {
        TrackerSingleTon trackerSingleTon = TrackerSingleTon.ADD;
        TrackerSingleTon trackerSingleTon1 = TrackerSingleTon.ADD;
        assertThat(trackerSingleTon == trackerSingleTon1, is(true));
    }

    @Test
    public void whenStaticLazySingle() {
        TrackerSingleTonLazy trackerSingleTonLazy = TrackerSingleTonLazy.getLazy();
        TrackerSingleTonLazy trackerSingleTonLazy1 = TrackerSingleTonLazy.getLazy();
        assertThat(trackerSingleTonLazy == trackerSingleTonLazy1, is(true));
    }

    @Test
    public void whenStaticFinalEager() {
        TrackerEagerLoad trackerEagerLoad = TrackerEagerLoad.getEagerLoad();
        TrackerEagerLoad trackerEagerLoad1 = TrackerEagerLoad.getEagerLoad();

        assertThat(trackerEagerLoad == trackerEagerLoad1, is(true));
    }

    @Test
    public void whenPrivateStaticFinalLazySingle() {
        TrackerInner trackerInner = TrackerInner.getTrackerInner();
        TrackerInner trackerInner1 = TrackerInner.getTrackerInner();
        assertThat(trackerInner == trackerInner1, is(true));
    }
}