package transport;

public class SimplePlane extends Air {

    public SimplePlane(String name, double speed, double fuelCapacity, double costPerKM, int countPassengers, int cargoCapacity) {
        super(name, speed, fuelCapacity, costPerKM, countPassengers, cargoCapacity);
    }

    @Override
    public String toString() {
        return "SimplePlane{" +
                "name='" + name +
                ", speed=" + speed +
                ", fuelCapacity=" + fuelCapacity +
                ", costPerKM=" + costPerKM +
                ", countPassengers=" + countPassengers +
                ", cargoCapacity=" + cargoCapacity +
                '}';
    }
}