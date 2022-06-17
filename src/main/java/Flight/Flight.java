package Flight;

import Aero.Plane;
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
        this.passengerArrayList = new ArrayList<>();

        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public ArrayList<Pilot> getPilotArrayList() {
        return pilotArrayList;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMemberArrayList() {
        return cabinCrewMemberArrayList;
    }

    public ArrayList<Passenger> getPassengerArrayList() {
        return passengerArrayList;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
