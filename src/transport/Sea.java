package transport;

public abstract class Sea extends Transport {
    private int countOfBlade;

    public Sea(String name, int speed, int costPerKilometr, int fuelCapacity, boolean isCanFly, boolean isCanSwim, int countOfBlade) {
        super(name, speed, costPerKilometr, fuelCapacity, isCanFly, isCanSwim);
        this.countOfBlade = countOfBlade;
    }
}