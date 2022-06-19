import Flight.Flight;
import People.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Passenger passenger1;


    @Before
    public void before(){
        passenger = new Passenger("Dave", 2);
        passenger1 = new Passenger("Emily", 1);
    }

    @Test
    public void hasAName(){
        assertEquals("Dave", passenger.getName());
    }

    @Test
    public void canUpdateNameOfPassenger(){
        passenger.setName("Barry");
        assertEquals("Barry", passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(1,passenger1.getNumberOfBags());
    }

    @Test
    public void canUpdateNumberOfBags(){
        passenger1.setNumberOfBags(3);
        assertEquals(3,passenger1.getNumberOfBags());
    }

}
