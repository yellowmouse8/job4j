package ru.job4j.start;

import ru.job4j.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private static final Random rm = new Random();

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + rm.nextInt());
    }

    public boolean replace(String id, Item newItem) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                this.items.set(this.items.indexOf(item), newItem);
            }
        }
        return true;
    }

    public boolean delete(String id) {
        boolean result = false;
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                this.items.remove(this.items.indexOf(item));
                result = true;
                break;
            }
        }
        return result;
    }

    public List<Item> findAll() {
        return this.items;
    }
        public List<Item> findByName (String key){
            List<Item> result = new ArrayList<>();
            for (Item item : this.items) {
                if (item.getName().equals(key)) {
                    result.add(item);
                }
            }
            return result;
        }

        public Item findById (String id){
            Item result = null;
            for (Item item : items) {
                if (item.getId().equals(id)) {
                    result = item;
                    break;
                }
            }

            return result;
        }
    }

