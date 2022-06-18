
import Flight.Flight;
import Flight.FlightManager;

import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import Plane.Plane;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;

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



    @Before
    public void before(){



        flight = new Flight(pilotArrayList, cabinCrewMemberArrayList, plane, "ABC123", "BAR", "EDI","09:00");
        flightManager = new FlightManager(flight);

    }


    @Test
    public void planesLuggageLimit(){
        assertEquals();
    }

}


//Assumptions:
//
//Each passenger bag weighs the same
//Planes reserve half of their total weight for passenger bags
//The weight of bag per person is the weight reserved for passenger bags divided by the capacity
//Passengers exist for a single flight only

//Create a FlightManager which can:
//
//calculate how much baggage weight should be reserved for each passenger for a flight
// planes weight / 2 = maxLuggageLimit
//maxLuggageLimit / capacity of flight.

//calculate how much baggage weight is booked by passengers of a flight
//calculate how much overall weight reserved for baggage remains for a flight