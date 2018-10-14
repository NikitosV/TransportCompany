package transport;

public class PassengerPlane extends Air {
    private int countPassengers;

    public PassengerPlane(String name, int speed, int costPerKilometr, int fuelCapacity, boolean isCanFly, boolean isCanSwim, int countOfEngines, boolean isReactiveEngine, int countPassengers) {
        super(name, speed, costPerKilometr, fuelCapacity, isCanFly, isCanSwim, countOfEngines, isReactiveEngine);
        this.countPassengers = countPassengers;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "name='" + name +
                ", speed=" + speed +
                ", costPerKilometr=" + costPerKilometr +
                ", fuelCapacity=" + fuelCapacity +
                ", countPassengers=" + countPassengers +
                '}';
    }
}