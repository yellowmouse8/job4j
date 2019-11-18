package ru.job4j.start;
import ru.job4j.models.*;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;
    private static final Random rm = new Random();

    public Item add (Item item){
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }
    private String generateId (){
        return String.valueOf(System.currentTimeMillis() + rm.nextInt());
    }
    public boolean replace (String id, Item item) {
        for (int i = 0; i != this.position; i++) {
            if (this.items[i].getId().equals(id)){
                 item = this.items[i]; // заменил итем на новый.
                this.items[i]= this.items[i+1];
                this.items[i+1] = item;
                break;
            }

        } return true;
    }
    public boolean delete (String id){
        Item [] item2 = new Item[items.length];
        for ( int i = 0; i != this.position; i++ ) {
            if (this.items[i].getId().equals(id)) {
                System.arraycopy(items, 0, items , 99, this.position);
            }

    }return true;
    }
    public Item[] findAll(){
        return Arrays.copyOf(items, position); // В одну строку , верно ?
    }
    public Item[] findByName (String key) {
        int rsl = 0;
        Item[] result = new Item[rsl];
        for (int i = 0; i != this.position; i++) {
            if (this.items[position++].getName().equals(key)) {
                rsl++;
            }
        }
        return result; // Возвращает массив с найденными Name;
    }
    public Item findById (String id){
        Item result = null;
        for (Item item : items){
            if (item != null && item.getId().equals(id)){
                result = item;
                break;
            }
        }

        return result;
    }

}
