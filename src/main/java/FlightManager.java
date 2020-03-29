public class FlightManager {

    private Flight flight;


    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int totalBaggageWeight() {
        return this.flight.planeWeight() / 2;
    }

    public int baggageWeightForEachPassenger() {
        return totalBaggageWeight() / this.flight.planeCapacity();
    }

    public int totalBaggageWeightBooked() {
        return baggageWeightForEachPassenger() * this.flight.passengerCount();
    }

    public int remainingTotalBaggageWeight() {
        return totalBaggageWeight() - totalBaggageWeightBooked();
    }
}
