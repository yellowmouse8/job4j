package ru.job4j.search;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PriorityQueueTEst {
@Test
    public void whenHigherPriority (){
    PriorityQueue queue = new PriorityQueue();
    queue.put(new Task("low", 3));
    queue.put(new Task("urgent", 1));
    queue.put(new Task("middle", 4));
    Task result = queue.take();
    assertThat(result.getDesc(), is("urgent"));
}
@Test
    public void whenSamePriority (){
    PriorityQueue queue = new PriorityQueue();
    queue.put(new Task("finish", 7));
    queue.put(new Task("start", 6));
    queue.put(new Task("middle", 3));
    Task result = queue.take();
    assertThat(result.getPriority(), is(3));
}
}
