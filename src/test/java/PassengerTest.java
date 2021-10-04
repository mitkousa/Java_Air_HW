import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;
    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        passenger = new Passenger("James", 2);
//        cabinCrewMember = CabinCrewMember.valueOf("Emma");
    }

    @Test
    public void passengerHasName(){
        assertEquals("James", passenger.getName());
    }

    @Test
    public void passengerHasNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
