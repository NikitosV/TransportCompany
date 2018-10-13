package transport;

public abstract class Terrestrial extends Transport{
    private int countOfWeels;

    public Terrestrial(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfWeels) {
        super(name, speed, costPerKilometr, fuelCapacity);
        this.countOfWeels = countOfWeels;
    }
}