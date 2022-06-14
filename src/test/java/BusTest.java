import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Edinburgh", 100);
        person = new Person();
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
        bus.addPassenger(person);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void ifBusFullWontTakePassenger(){
        bus = new Bus("Glasgow", 2);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals("full", bus.addPassenger(person));
    }

    @Test
    public void canRemovePassengerFromBus(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.getNumberOfPassengers());
    }

    }
