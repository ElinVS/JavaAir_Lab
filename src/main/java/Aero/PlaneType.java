package Aero;

public enum PlaneType {

    BOEING747(416,171000),
    AIRBUS380(520,220000),
    FOKKER100(300,130000),
    CONCORDE(540,250000);


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
