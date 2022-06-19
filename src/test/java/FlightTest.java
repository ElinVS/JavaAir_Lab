import Plane.Plane;
import Plane.PlaneType;
import Flight.Flight;
import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import People.RankType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    ArrayList<Pilot> pilotArrayList;
    Pilot pilot1;
    Pilot pilot2;

    ArrayList<CabinCrewMember> cabinCrewMemberArrayList;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;

    Plane plane;

    ArrayList<Passenger> passengerArrayList;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    Flight flight;


    @Before
    public void before(){

        pilot1 = new Pilot("Amanda", RankType.CAPTAIN,"AAA111");
        pilot2 = new Pilot("Bea", RankType.FIRST_OFFICER, "BBB222");
        pilotArrayList = new ArrayList<>();
        pilotArrayList.add(pilot1);
        pilotArrayList.add(pilot2);

        cabinCrewMember1 = new CabinCrewMember("Kip", RankType.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Pernilla", RankType.FLIGHT_ATTENDANT);
        cabinCrewMember3 = new CabinCrewMember("Penny", RankType.PURSER);
        cabinCrewMemberArrayList = new ArrayList<>();
        cabinCrewMemberArrayList.add(cabinCrewMember1);
        cabinCrewMemberArrayList.add(cabinCrewMember2);
        cabinCrewMemberArrayList.add(cabinCrewMember3);

        plane = new Plane(PlaneType.BOEING747);

        passengerArrayList = new ArrayList<>();
        passenger1 = new Passenger("Ophelia", 3);
        passenger2 = new Passenger("Barry", 4);
        passenger3 = new Passenger("Sophia", 2);

        flight = new Flight(pilotArrayList, cabinCrewMemberArrayList, plane, "EJK432", "PAR", "LAX", "15:45");

    }

    @Test
    public void flightHasPilot(){
        assertEquals(2,flight.getPilotArrayCount());
    }

    @Test
    public void flightHasACabinCrew(){
        assertEquals(3,flight.getCabinCrewMemberCount().size());
    }

    @Test
    public void hasAPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasAFlightNumber(){
        assertEquals("EJK432", flight.getFlightNumber());
    }

    @Test
    public void hasADestination(){
        assertEquals("PAR", flight.getDestination());
    }

    @Test
    public void hasADepartureAirport(){
        assertEquals("LAX", flight.getDepartureAirport());
    }

    @Test
    public void hasADepartureTime(){
        assertEquals("15:45", flight.getDepartureTime());
    }

    @Test
    public void passengerListStartsEmpty(){
        assertEquals(0, flight.getPassengerCount());
    }

    @Test
    public void getNumberOfAvailableSeats(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(2,flight.getSeatCount());
    }

    @Test
    public void canAddPassengerToPlane(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void canNotAddPassengerToPlane(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(0,flight.getSeatCount());
        assertEquals(5, flight.getPassengerCount());
    }


}
