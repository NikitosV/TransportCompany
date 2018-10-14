package transport.air;

import transport.Air;

public class PassengerPlane extends Air {
    private int countPassengers;

    public PassengerPlane(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfEngines, boolean isReactiveEngine, int countPassengers) {
        super(name, speed, costPerKilometr, fuelCapacity, countOfEngines, isReactiveEngine);
        this.countPassengers = countPassengers;
    }
}