import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Edinburgh", 100);
        person = new Person();
        busStop = new BusStop("Central");
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
    }

    @Test
    public void busIsEmpty(){
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void busHasDestination(){
        assertEquals("Edinburgh", bus.getDestination());
    }

    @Test
    public void canAddPassengers(){
        bus.addPassenger(busStop);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void ifBusFullWontTakePassenger(){
        bus = new Bus("Glasgow", 2);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        assertEquals("full", bus.addPassenger(busStop));
    }

    @Test
    public void canRemovePassengerFromBus(){
        bus.addPassenger(busStop);
        bus.removePassenger();
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canPickUpPassengerFromQueueOntoBus(){
        bus.addPassenger(busStop);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    }
