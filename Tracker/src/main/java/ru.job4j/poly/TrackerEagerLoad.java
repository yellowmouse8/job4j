package ru.job4j.poly;
import ru.job4j.start.Tracker;
import ru.job4j.models.Item;

public class TrackerEagerLoad {
    private Tracker tracker = new Tracker();
    private static final TrackerEagerLoad EAGER_LOAD = new TrackerEagerLoad();
    private TrackerEagerLoad(){}
    public static TrackerEagerLoad getEagerLoad(){
        return EAGER_LOAD;
    }
    public Item add(Item item){
        return tracker.add(item);
    }
    public Item[]findAll(){
        return tracker.findAll();
    }
    public Item[] findByName (String key){
        return tracker.findByName(key);
    }
    public static void main (String[]args){
        TrackerEagerLoad trackerEagerLoad = TrackerEagerLoad.getEagerLoad();
    }
}
