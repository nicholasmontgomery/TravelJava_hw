import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Plane plane;
    private Date departureTime;
    private Passenger passenger1;

    @Before
    public void setup() {
        plane = new Plane(PlaneType.BOEING737);
        departureTime = new Date(2020, 05, 13, 20, 00);
        flight = new Flight(plane, "EZY123", "Stanstead", "Edinburgh", departureTime);
        flightManager = new FlightManager(flight);
        passenger1 = new Passenger("Nick Montgomery", 2);
    }

    @Test
    public void canGetTotalBaggageWeight() {
        assertEquals(39000, flightManager.totalBaggageWeight());
    }

    @Test
    public void canGetBaggageWeightForEachPassenger() {
        assertEquals(195, flightManager.baggageWeightForEachPassenger());
    }

    @Test
    public void canGetTotalBaggageWeightBooked() {
        this.flight.addPassenger(passenger1);
        assertEquals(195, flightManager.totalBaggageWeightBooked());
    }

    @Test
    public void canGetRemainingTotalBaggageWeight() {
        this.flight.addPassenger(passenger1);
        assertEquals(38805, flightManager.remainingTotalBaggageWeight());
    }



}
