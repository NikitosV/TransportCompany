package transport;

public class Boat extends Sea {

    public Boat(String name, int speed, int costPerKilometr, int fuelCapacity, boolean isCanFly, boolean isCanSwim, int countOfBlade) {
        super(name, speed, costPerKilometr, fuelCapacity, isCanFly, isCanSwim, countOfBlade);
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