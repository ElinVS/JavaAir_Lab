import Flight.Flight;
import Flight.FlightManager;
import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import People.RankType;
import Plane.Plane;
import Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flightA;
    Plane plane;

    Pilot pilot;

    ArrayList<Pilot> pilotArrayList;
    Pilot pilot1;
    Pilot pilot2;

    ArrayList<CabinCrewMember> cabinCrewMemberArrayList;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;


    ArrayList<Passenger> passengerArrayList = new ArrayList<>();
    Passenger passenger1;
    Passenger passenger2;


    @Before
    public void before(){
        pilot = new Pilot("Bob", RankType.CAPTAIN, "223344");
        plane = new Plane(PlaneType.FOKKER100);
        passengerArrayList = new ArrayList<>();

        flightA = new Flight(pilotArrayList, cabinCrewMemberArrayList, plane, "ABC123", "LON", "EDI", "09:00");
        flightManager = new FlightManager(flightA);
    }

    @Test
    public void hasAFlight(){
        assertEquals(flightA,flightManager.getFlight());
    }

    @Test
    public void flightHasAWeight(){
        assertEquals(300, plane.getWeight());
    }

    @Test
    public void planesLuggageLimit(){
        assertEquals(150,flightManager.getLuggageLimit());
    }

    @Test
    public void passengerLuggageLimitForAFlight(){
        assertEquals(15, flightManager.passengerLuggageLimit());
    }

    @Test
    public void bookedLuggageWeight(){
        flightA.addPassenger(passenger1);
        flightA.addPassenger(passenger2);
        assertEquals(30, flightManager.bookedWeight());
    }

    @Test
    public void availableLuggageWeight(){
        flightA.addPassenger(passenger1);
        flightA.addPassenger(passenger2);
        assertEquals(120, flightManager.remainingLuggageWeight());
    }
}


