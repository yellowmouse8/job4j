package ru.job4j.poly;
import ru.job4j.models.Item;
import ru.job4j.start.Tracker;

public class TrackerSingleTonLazy {
    private Tracker tracker = new Tracker();
    private static TrackerSingleTonLazy lazy;
    private TrackerSingleTonLazy (){}
    public static TrackerSingleTonLazy getLazy(){
        if (lazy == null){
            lazy = new TrackerSingleTonLazy();
        }
        return lazy;
    }
    public Item add(Item item){
        return tracker.add(item);
    }
    public Item[] findAll(){
        return tracker.findAll();
    }
    public Item[] findByName(String key){
        return tracker.findByName(key);
    }
    public static void main(String[]args){
        TrackerSingleTonLazy trackerSingleTonLazy = TrackerSingleTonLazy.getLazy();
    }
}
