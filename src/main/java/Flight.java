import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Date departureTime;
    private ArrayList<Passenger> passengers;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, Date departureTime){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public Date getDepartureTime() {
        return this.departureTime;
    }

    public void addPassenger(Passenger passenger) {
        if (this.plane.getCapacityFromEnum() > this.passengerCount()) {
            this.passengers.add(passenger);
        }
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public int planeWeight() {
        return this.plane.getTotalWeightFromEnum();
    }

    public int planeCapacity() {
        return this.plane.getCapacityFromEnum();
    }

    public int remainingSeats() {
        return this.plane.getCapacityFromEnum() - passengerCount();
    }
}


