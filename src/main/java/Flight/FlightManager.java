package Flight;


public class FlightManager {

    private Flight flight;


    public FlightManager(Flight flight) {
        this.flight = flight;
    }


    public Flight getFlight() {
        return this.flight;
    }

    public int getLuggageLimit() {
        return this.flight.getPlane().getWeight() / 2;
    }

    public int passengerLuggageLimit() {
        return getLuggageLimit() / this.flight.getPlane().getCapacity();
    }

    public int bookedWeight() {
        return flight.getPassengerCount() * passengerLuggageLimit();
    }

    public int remainingLuggageWeight() {
        return getLuggageLimit() - bookedWeight();
    }
}
