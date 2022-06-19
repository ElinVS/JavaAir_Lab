package People;


import Flight.Flight;

import java.util.Random;

public class Passenger extends Person{

    private int numberOfBags;
    private int seatNumber;

    public Passenger(String name, int numberOfBags) {
        super(name);
        this.numberOfBags = numberOfBags;
        this.seatNumber = 0;

    }

    public int getNumberOfBags() {
        return this.numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

//    public int getSeatNumber() {
//        return this.seatNumber;
//
//    }
//
//    public void setSeatNumber() {
//        Random rand = new Random();
//        int upperbound = this.flight.getSeatCount();
//        seatNumber = rand.nextInt(upperbound);
//        }

}



