import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Date departureTime;
    private Passenger passenger1;


    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING737);
        departureTime = new Date(2020, 05, 13, 20, 00);
        flight = new Flight(plane, "EZY123", "Stanstead", "Edinburgh", departureTime);
        passenger1 = new Passenger("Nick Montgomery", 2, false);
    }

    @Test
    public void canAddPassenger() {
        flight.addPassenger(passenger1);
        assertEquals(1, flight.passengerCount());
        assertTrue(passenger1.isPassengerCheckedIn());
        assertEquals(1, passenger1.getSeatNumber());
    }

    @Test
    public void canCalculateRemainingSeats() {
        flight.addPassenger(passenger1);
        assertEquals(199, flight.remainingSeats());
    }

    @Test
    public void returnFlightDate() {
        assertEquals("Sun Jun 13 20:00:00 BST 3920", flight.getDepartureTime().toString());
    }

    @Test
    public void testFlightCapacity() {
        assertEquals(200, flight.planeCapacity());
    }


}

