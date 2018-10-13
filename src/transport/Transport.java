package transport;

abstract class Transport {
    private String name;
    private int speed;
    private int costPerKilometr;
    private int fuelCapacity;

    Transport(String name, int speed, int costPerKilometr, int fuelCapacity) {
        this.name = name;
        this.speed = speed;
        this.costPerKilometr = costPerKilometr;
        this.fuelCapacity = fuelCapacity;
    }
}
