package ru.job4j.start;
import ru.job4j.models.*;

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
        for (int i = 0; i != this.items.length; i++) {
            if (this.items[i].getId().equals(id)){


            }
        }
        return true;
    }
    public boolean delete (String id){
        return true;
    }
    public Item[] findAll(){
        Item[] result = new Item[position];
        for (int i = 0; i!=this.position; i++){
            result[i] = this.items[i];
        }
        return result;
    }
    public Item[] findByName (String key){
        Item [] result = new Item[items.length];
        for (int i = 0; i!=this.items.length; i++){
            if (this.items[i].getName().equals(key)){
         result[i] = this.items[i];
            }
        }
        return result;
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
