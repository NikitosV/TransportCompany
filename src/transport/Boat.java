package transport;

public class Boat extends Sea {
    public Boat(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfBlade) {
        super(name, speed, costPerKilometr, fuelCapacity, countOfBlade);
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", costPerKilometr=" + costPerKilometr +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }
}