package ru.job4j.start;

import ru.job4j.models.*;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;
    private static final Random rm = new Random();

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + rm.nextInt());
    }

    public boolean replace(String id, Item item) {
        for (int i = 0; i != this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                this.items[i] = item;
                break;
            }
        }
        return true;
    }

    public void delete(String id) {
        int i2;
        for (int i = 0; i != this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                i2 = i;
                System.arraycopy(this.items, i2+1 , this.items, i2, this.position-i2-1);
                this.items[position--]=null;
                break;
            }
        }
    }

    public Item[] findAll() {
        return  Arrays.copyOf(this.items,this.position);// В одну строку , верно ?
    }

    public Item [] findByName(String key) {
        int rsl = 0;
        Item [] result = new Item [this.position - rsl];
        for (int i = 0; i != this.position; i++) {
            if (this.items[i].getName().equals(key)) {
               rsl++;
            }
        }
        return result;
    }

    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i!=this.position; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                result = this.items[i];
                break;
            }
        }

        return result;
    }

}
