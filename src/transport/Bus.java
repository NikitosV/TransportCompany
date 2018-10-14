package transport;

public class Bus extends Terrestrial {
    private int countPassengers;

    public Bus(String name, int speed, int costPerKilometr, int fuelCapacity, boolean isCanFly, boolean isCanSwim, int countOfWeels, int countPassengers) {
        super(name, speed, costPerKilometr, fuelCapacity, isCanFly, isCanSwim, countOfWeels);
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
        return "Bus{" +
                "countPassengers=" + countPassengers +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", costPerKilometr=" + costPerKilometr +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }
}