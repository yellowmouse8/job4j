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
    queue.put(new Task("urgent", 2));
    queue.put(new Task("middle", 4));
    Task result = queue.take();
    assertThat(result.getDesc(), is("urgent"));
}
}
