package ru.job4j.poly;
import ru.job4j.models.Item;
import ru.job4j.start.Tracker;

public class TrackerInner {
    private Tracker tracker = new Tracker();
    private TrackerInner (){
    }
    public static TrackerInner getTrackerInner (){
        return Holder.TRACKER_INNER;
    }
    public Item add(Item item){
        return tracker.add(item);
    }
    public Item [] findAll (){
        return tracker.findAll();
    }
    public Item [] findByName (String key){
        return tracker.findByName(key);
    }
    private static final class Holder {
        private static final TrackerInner TRACKER_INNER = new TrackerInner();
    }
    public static void main(String[]args){
        TrackerInner trackerInner = TrackerInner.getTrackerInner();
    }
}
