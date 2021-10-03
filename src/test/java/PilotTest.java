import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;
    Plane plane;

    @Before
    public  void before(){
        pilot = new Pilot("Matthew", "Senior First Officer", "ABC737-800");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Matthew", pilot.getName());
    }

    @Test
    public void pilotCanFlyAPlane(){
        assertEquals("Matthew can fly BOEING747", pilot.flyThePlane());
    }
}
