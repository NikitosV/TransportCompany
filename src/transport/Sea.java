package transport;

public abstract class Sea extends Transport {
    int countOfBlade;

    public Sea(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfBlade) {
        super(name, speed, costPerKilometr, fuelCapacity);
        this.countOfBlade = countOfBlade;
    }
}
