package transport;

public abstract class Terrestrial extends Transport{
    private int countOfWeels;

    public Terrestrial(String name, int speed, int costPerKilometr, int fuelCapacity, boolean isCanFly, boolean isCanSwim, int countOfWeels) {
        super(name, speed, costPerKilometr, fuelCapacity, isCanFly, isCanSwim);
        this.countOfWeels = countOfWeels;
    }
}