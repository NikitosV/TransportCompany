package transport;

public class SimplePlane extends Air {

    public SimplePlane(String name, int speed, int costPerKilometr, int fuelCapacity, boolean isCanFly, boolean isCanSwim, int countOfEngines, boolean isReactiveEngine) {
        super(name, speed, costPerKilometr, fuelCapacity, isCanFly, isCanSwim, countOfEngines, isReactiveEngine);
    }

    @Override
    public String toString() {
        return "SimplePlane{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", costPerKilometr=" + costPerKilometr +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }
}
