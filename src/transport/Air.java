package transport;

public abstract class Air extends Transport {

    public Air(String name, double speed, double fuelCapacity, double costPerKM, int countPassengers, int cargoCapacity) {
        super(name, speed, fuelCapacity, costPerKM, countPassengers, cargoCapacity);
    }
}