package ru.job4j.poly;

import ru.job4j.models.Item;
import ru.job4j.start.Tracker;

import java.util.List;

public enum TrackerSingleTon {
    ADD;
    private Tracker tracker = new Tracker();

    public Item add(Item item) {
        return tracker.add(item);
    }

    public List<Item> findAll() {
        return tracker.findAll();
    }

    public List<Item> findByName(String key) {
        return tracker.findByName(key);
    }

    public static void main(String[] args) {
        TrackerSingleTon trackerSingleTon = TrackerSingleTon.ADD;
    }
}
