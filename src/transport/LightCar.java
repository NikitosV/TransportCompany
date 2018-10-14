package transport;

public class LightCar extends Terrestrial {

    public LightCar(String name, int speed, int costPerKilometr, int fuelCapacity, boolean isCanFly, boolean isCanSwim, int countOfWeels) {
        super(name, speed, costPerKilometr, fuelCapacity, isCanFly, isCanSwim, countOfWeels);
    }

    @Override
    public String toString() {
        return "LightCar{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", costPerKilometr=" + costPerKilometr +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }
}