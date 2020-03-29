import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger1;


    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING737);
        flight = new Flight(plane, "EZY123", "Stanstead", "Edinburgh", 1900);
        passenger1 = new Passenger("Nick Montgomery", 2);
    }

    @Test
    public void canAddPassenger() {
        flight.addPassenger(passenger1);
        assertEquals(1, flight.passengerCount());
    }

    @Test
    public void canCalculateRemainingSeats() {
        flight.addPassenger(passenger1);
        assertEquals(199, flight.remainingSeats());
    }
}
