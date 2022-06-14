import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Central");
        person = new Person();
    }

    @Test
    public void queueIsEmpty(){
        assertEquals(0, busStop.getQueueLength());
    }

    @Test
    public void busStopHasName(){
        assertEquals("Central", busStop.getName());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.getQueueLength());
    }

    @Test
    public void canRemoverPersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(0, busStop.getQueueLength());
    }

}
