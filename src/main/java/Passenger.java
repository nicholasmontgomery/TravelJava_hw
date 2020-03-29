public class Passenger {

    private String name;
    private int numberOfBags;
    private boolean isPassengerCheckedIn;
    private int seatNumber;


    public Passenger(String name, int numberOfBags, boolean isPassengerCheckedIn) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.isPassengerCheckedIn = isPassengerCheckedIn;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void checkPassengerIn() {
        this.isPassengerCheckedIn = true;
    }

    public boolean isPassengerCheckedIn() {
        return this.isPassengerCheckedIn;
    }

    public void allocatePassengerSeatNumber(int generatedSeatNumber) {
        this.seatNumber = generatedSeatNumber;
    }

}