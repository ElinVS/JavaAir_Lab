package Aero;

public enum PlaneType {

    BOEING747(5,100),
    AIRBUS380(5,200),
    FOKKER100(10,300),
    CONCORDE(15,400);


    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.weight;
    }
}
