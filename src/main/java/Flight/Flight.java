package Flight;

import Plane.Plane;
import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilotArrayList;
    private ArrayList<CabinCrewMember> cabinCrewMemberArrayList;
    private ArrayList<Passenger> passengerArrayList;
    private Plane plane;

    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(ArrayList<Pilot> pilotArrayList, ArrayList<CabinCrewMember> cabinCrewMemberArrayList, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilotArrayList = pilotArrayList;
        this.cabinCrewMemberArrayList = cabinCrewMemberArrayList;
        this.passengerArrayList = new ArrayList<Passenger>();

        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public int getPilotArrayCount() {
        return this.pilotArrayList.size();
    }

    public ArrayList<CabinCrewMember> getCabinCrewMemberCount() {
        return this.cabinCrewMemberArrayList;
    }

    public int getPassengerCount() {
        return this.passengerArrayList.size();
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public void addPassenger(Passenger passenger) {
        if (passengerArrayList.size() < this.plane.getCapacity()){
             this.passengerArrayList.add(passenger);
        }
    }

    public int getSeatCount() {
        return this.plane.getCapacity() - this.getPassengerCount();
    }
}
