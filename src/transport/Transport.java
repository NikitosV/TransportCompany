package transport;

public abstract class Transport {
    protected String name;
    protected int speed;
    protected int costPerKilometr;
    protected int fuelCapacity;

    Transport(String name, int speed, int costPerKilometr, int fuelCapacity) {
        this.name = name;
        this.speed = speed;
        this.costPerKilometr = costPerKilometr;
        this.fuelCapacity = fuelCapacity;
    }
}