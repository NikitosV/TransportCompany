package transport;

public abstract class Air extends Transport {
    boolean isAirTransport;

    public Air(String name, double speed, double fuelCapacity, double costPerKM, int countPassengers, int cargoCapacity, boolean isAirTransport) {
        super(name, speed, fuelCapacity, costPerKM, countPassengers, cargoCapacity);
        this.isAirTransport = isAirTransport;
    }

    public boolean isAirTransport() {
        return isAirTransport;
    }
}