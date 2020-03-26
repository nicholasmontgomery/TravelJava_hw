import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private int departureTime;
    private ArrayList<Passenger> passengers;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, int departureTime){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }
}


