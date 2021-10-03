import org.junit.Before;

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
}
