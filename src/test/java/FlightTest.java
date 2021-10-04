import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Passenger passenger;
    Plane plane;

    @Before
    public void before() {
        flight = new Flight("FR756", "EDI", "GLA", "18:30");
        pilot = new Pilot("Matthew","Senior First Officer", "ABC737-800");
    }

    @Test
    public  void hasAvailableSeats(){
        flight.addPassenger(passenger);
        assertEquals(79, flight.availableSeats());
    }

    @Test
    public void canBookAPassenger(){
        int totalSeats = 80;
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(78,flight.availableSeats());
        flight.bookPassenger(passenger);
        assertEquals(77,flight.availableSeats());
    }
}
