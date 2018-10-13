package transport;

abstract class Transport {
    String name;
    int speed;
    int costPerKilometr;
    int fuelCapacity;

    public Transport(String name, int speed, int costPerKilometr, int fuelCapacity) {
        this.name = name;
        this.speed = speed;
        this.costPerKilometr = costPerKilometr;
        this.fuelCapacity = fuelCapacity;
    }
}
