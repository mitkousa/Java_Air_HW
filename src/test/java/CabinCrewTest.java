import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {
    CabinCrewMember cabinCrewMember;
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("James", 2);
    }

    @Test
    public void CabinCrewCanRelayMessage(){
        cabinCrewMember = new CabinCrewMember(Rank.FLIGHT_ATTENDANT1);
        assertEquals("Emma can relay message", cabinCrewMember.relayMessage());
    }
}
