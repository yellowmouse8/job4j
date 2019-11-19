package start;
import org.junit.Test;
import ru.job4j.models.Item;
import ru.job4j.start.Tracker;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
public class TrackerTest {
    @Test
    public void whenAddnewUtemThenTrackerHasSameItem (){
        Tracker tracker = new Tracker();
        Item item = new Item(" test1 ", " 1D124");
        Item expected = tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result, is(expected));
    }
    @Test
    public void replaceItem (){
        Tracker tracker = new Tracker();
        Item previous = new Item("First", "1W124W45");
        tracker.add(previous);
        Item next = new Item("Second", " wz1124lgf");
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("Second"));
    }
    @Test
    public void deleteItem (){
        Tracker tracker = new Tracker();
        Item item = new Item(" Disc ", "1wwd234");
        Item item2 = new Item(" Set ", " 2sfd23");
        Item item3 = new Item ( " Try " , " 3sdffdg");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        tracker.delete(item2.getId());

        Item [] expected = new Item[]{item, item3};
        Item[] result = tracker.findAll();
        assertThat(result, is(expected));
    }
    @Test
    public void findAll (){
        Tracker tracker = new Tracker();
        Item item = new Item(" Void ", " id124124 ");
        Item item2 = new Item ( " Type ", " id12445454");
        Item item3 = new Item ( " Const ", " id4343434");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        Item []  expected = new Item []{item, item2, item3};
        Item [] result = tracker.findAll();
        assertThat(result, is(expected));
    }
    @Test
    public void findByName (){
        Tracker tracker = new Tracker();
        Item item = new Item(" bill " , " id12434");
        Item item2 = new Item(" of  ", " id451232");
        Item item3 = new Item (" lading ", " id333455");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        Item [] expected = new Item[]{item2};
        Item [] result = tracker.findByName(" of ");
        assertThat(result, is(expected));
    }
    @Test
    public void findByID (){
        Tracker tracker = new Tracker();
        Item item = new Item (" Bear " , " id14342434");
        Item item2 = new Item (" Todd " , " id12443434");
        Item item3 = new Item (" Frog " , " id12434434");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        String result = tracker.findById(item2.getId()).getId();
        String expected = " Todd ";
        assertThat(result, is (expected));

    }
}
